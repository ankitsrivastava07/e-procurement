package jwtsession.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jwtsession.constant.TokenStatusConstant;
import jwtsession.controller.JwtSessionDto;
import jwtsession.controller.TokenStatus;
import jwtsession.dao.JwtSessionDao;
import jwtsession.dao.entity.JwtSessionEntity;
import jwtsession.exceptionHandle.InvalidTokenException;
import jwtsession.jwtutil.JwtSessionServiceProxy;
import jwtsession.jwtutil.JwtTokenUtil;
import jwtsession.translator.ObjectTranslator;

@Service
public class JwtSessionServiceImpl implements JwtSessionService {

	@Autowired
	private ObjectTranslator objectTranslator;

	@Autowired
	JwtSessionServiceProxy jwtSessionServiceProxy;

	@Autowired
	private JwtSessionDao jwtSessionDao;

	@Autowired
	TokenStatus tokenStatus;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Override
	public TokenStatus isValidToken(String token) {

		jwtTokenUtil.validateToken(token);

		Long userId = jwtTokenUtil.getUserId(token);

		Boolean status = jwtSessionDao.isValidToken(token);

		if (!status)
			throw new InvalidTokenException("Invalid Token or token does not exist");

		tokenStatus.setStatus(TokenStatusConstant.TRUE);
		tokenStatus.setMessage(TokenStatusConstant.MESSAGE);
		tokenStatus.setToken(token);

		String firstName = jwtSessionServiceProxy.getFirstName(userId);

		tokenStatus.setFirstName(firstName);

		return tokenStatus;
	}

	@Override
	public TokenStatus saveToken(JwtSessionDto tokenDto) {

		JwtSessionEntity entity = new JwtSessionEntity();

		entity.setUserId(tokenDto.getUserId());
		entity.setToken(tokenDto.getToken());

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
}
