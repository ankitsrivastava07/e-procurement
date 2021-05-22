package jwtsession.service;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jwtsession.constant.TokenStatusConstant;
import jwtsession.controller.TokenStatus;
import jwtsession.dao.JwtSessionDao;
import jwtsession.dao.entity.JwtSessionEntity;
import jwtsession.dao.repository.JwtSessionRepository;
import jwtsession.exceptionHandle.InvalidTokenException;
import jwtsession.jwtutil.JwtTokenUtil;

@Service
public class JwtSessionServiceImpl implements JwtSessionService {

	@Autowired
	private JwtSessionDao jwtSessionDao;

	@Autowired
	TokenStatus tokenStatus;

	@Autowired
	JwtSessionRepository repository;

	@Autowired
	UserServiceProxy userServiceProxy;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Override
	public TokenStatus isValidToken(String token) {

		jwtTokenUtil.validateToken(token);

		Boolean status = jwtSessionDao.isValidToken(token);

		if (!status)
			throw new InvalidTokenException("Invalid Token or token does not exist");

		tokenStatus.setStatus(TokenStatusConstant.TRUE);
		tokenStatus.setMessage(TokenStatusConstant.MESSAGE);
		tokenStatus.setToken(token);
		String firstName = userServiceProxy.getFirstName(token).getBody();
		tokenStatus.setFirstName(firstName);

		return tokenStatus;
	}

	@Override
	public TokenStatus saveToken(String token) {

		Long id = jwtTokenUtil.getUserId(token);

		JwtSessionEntity entity = new JwtSessionEntity();

		entity.setUserId(id);
		entity.setToken(token);

		jwtSessionDao.saveToken(entity);

		tokenStatus.setStatus(TokenStatusConstant.TRUE);
		tokenStatus.setMessage(TokenStatusConstant.MESSAGE);

		return tokenStatus;
	}

	@Override
	public TokenStatus removeToken(String token) {

		JwtSessionEntity jwtEntity = jwtSessionDao.removeToken(token);

		if (jwtEntity != null) {

			tokenStatus.setStatus(TokenStatusConstant.TRUE);
			tokenStatus.setMessage(TokenStatusConstant.MESSAGE);
			tokenStatus.setToken(jwtEntity.getToken());
			tokenStatus.setCreatedAt(jwtEntity.getCreatedAt());
		}

		return tokenStatus;
	}

	@Transactional
	@Override
	public TokenStatus removeAllTokens(Map<String, String> map) {

		Long user_id = null;

		if (map != null && !map.isEmpty() && map.get("request").equals("change-password")) {
			String token = map.get("token");
			user_id = jwtTokenUtil.getUserId(token);
			repository.removeAllTokensNot(token, user_id);
		}

		else if (!map.isEmpty()) {
			user_id = jwtTokenUtil.getUserId(map.get("token"));
			 repository.removeAllTokensById(user_id);
		}
		tokenStatus.setStatus(TokenStatusConstant.TRUE);
		tokenStatus.setCreatedAt(LocalDateTime.now());
		tokenStatus.setMessage(TokenStatusConstant.MESSAGE);

		return tokenStatus;
	}
}
