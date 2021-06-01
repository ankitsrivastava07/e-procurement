package jwtsession.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import jwtsession.controller.TokenStatus;
import jwtsession.dao.entity.JwtSessionEntity;
import jwtsession.dao.repository.JwtSessionRepository;

@Repository
public class JwtSessionDaoImpl implements JwtSessionDao {

	@Autowired
	JwtSessionRepository repository;

	@Autowired
	TokenStatus tokenStatus;

	@Override
	public JwtSessionEntity isValidToken(String token) {
		return repository.findByToken(token);
	}

	@Override
	public String saveToken(JwtSessionEntity entity) {
		return repository.save(entity).getToken();
	}

	@Transactional
	@Override
	public Integer removeToken(String token) {

		Integer deleted = repository.removeToken(token);

		return deleted;
	}

	@Override
	public Boolean isTokenExist(String token) {
		repository.findByToken(token);
		return null;
	}
}
