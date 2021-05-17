package jwtsession.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jwtsession.controller.JwtSessionDto;
import jwtsession.dao.JwtSessionDao;
import jwtsession.dao.entity.JwtSessionEntity;
import jwtsession.translator.ObjectTranslator;

@Service
public class JwtSessionServiceImpl implements JwtSessionService {

	@Autowired
	private ObjectTranslator objectTranslator;

	@Autowired
	JwtSessionDao jwtSessionDao;

	@Override
	public Boolean isValidToken(String jwt) {
		jwtSessionDao.isValidToken(jwt);
		return null;
	}

	@Override
	public String saveToken(JwtSessionDto tokenDto) {

		JwtSessionEntity entity = objectTranslator.translate(tokenDto, JwtSessionEntity.class);

		return jwtSessionDao.saveToken(entity);
	}
}
