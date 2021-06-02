package jwtsession.service;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.jsonwebtoken.ExpiredJwtException;
import jwtsession.constant.TokenStatusConstant;
import jwtsession.controller.TokenStatus;
import jwtsession.dao.JwtSessionDao;
import jwtsession.dao.entity.JwtSessionEntity;
import jwtsession.dao.repository.JwtSessionRepository;
import jwtsession.jwtutil.JwtAccessTokenUtil;
import jwtsession.jwtutil.JwtRefreshTokenUtil;

@Service
public class JwtSessionServiceImpl implements JwtSessionService {

	@Autowired
	private JwtSessionDao jwtSessionDao;

	@Autowired
	JwtSessionRepository repository;

	@Autowired
	UserServiceProxy userServiceProxy;

	@Autowired
	private JwtAccessTokenUtil jwtAccessTokenUtil;

	@Autowired
	private JwtRefreshTokenUtil jwtRefreshTokenUtil;

	@Override
	public TokenStatus isValidToken(String accessToken) {

		TokenStatus tokenStatus = new TokenStatus();

		try {

			jwtAccessTokenUtil.validateToken(accessToken);

		} catch (ExpiredJwtException exception) {

			JwtSessionEntity jwtSessionToken = repository.findByAccessToken(accessToken);

			if (jwtSessionToken != null) {

				jwtAccessTokenUtil.validateToken(jwtSessionToken.getRefreshToken());

				accessToken = jwtAccessTokenUtil.generateAccessToken(jwtSessionToken.getId());

				String refreshToken = jwtRefreshTokenUtil.generateRefreshToken(jwtSessionToken.getId());

				jwtSessionToken.setAccessToken(accessToken);

				jwtSessionToken.setRefreshToken(refreshToken);

				repository.save(jwtSessionToken);

			}
		}
		tokenStatus.setStatus(TokenStatusConstant.TRUE);
		tokenStatus.setMessage(TokenStatusConstant.MESSAGE);
		tokenStatus.setAccessToken(accessToken);

		jwtAccessTokenUtil.validateToken(accessToken);

		String firstName = userServiceProxy.getFirstName(accessToken).getBody();
		tokenStatus.setFirstName(firstName);
		return tokenStatus;

	}

	@Override
	public TokenStatus generateToken(Long userId) {

		TokenStatus tokenStatus = new TokenStatus();

		String accessToken = jwtAccessTokenUtil.generateAccessToken(userId);
		String refreshToken = jwtRefreshTokenUtil.generateRefreshToken(userId);

		JwtSessionEntity entity = new JwtSessionEntity();

		entity.setUserId(userId);
		entity.setAccessToken(accessToken);
		entity.setRefreshToken(refreshToken);
		jwtSessionDao.saveToken(entity);

		tokenStatus.setStatus(TokenStatusConstant.TRUE);
		tokenStatus.setMessage(TokenStatusConstant.MESSAGE);
		tokenStatus.setAccessToken(accessToken);

		return tokenStatus;
	}

	@Override
	public TokenStatus removeToken(String token) {

		Integer count = jwtSessionDao.removeToken(token);
		TokenStatus tokenStatus = new TokenStatus();
		if (count != null) {

			tokenStatus.setStatus(TokenStatusConstant.TRUE);
			tokenStatus.setMessage(TokenStatusConstant.MESSAGE);
		}

		return tokenStatus;
	}

	@Transactional
	@Override
	public TokenStatus removeAllTokens(Map<String, String> map) {

		Long user_id = null;
		TokenStatus tokenStatus = new TokenStatus();
		if (map != null && !map.isEmpty() && map.get("request").equals("change-password")) {
			String token = map.get("token");
			user_id = jwtAccessTokenUtil.getUserId(token);
			repository.removeAllTokensNot(token, user_id);
		}

		else if (!map.isEmpty()) {
			user_id = jwtAccessTokenUtil.getUserId(map.get("token"));
			repository.removeAllTokensById(user_id);
		}
		tokenStatus.setStatus(TokenStatusConstant.TRUE);
		tokenStatus.setCreatedAt(LocalDateTime.now());
		tokenStatus.setMessage(TokenStatusConstant.MESSAGE);

		return tokenStatus;
	}
}
