package jwtsession.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jwtsession.dao.entity.JwtSessionEntity;
import jwtsession.dao.repository.JwtSessionRepository;

@Repository
public class JwtSessionDaoImpl implements JwtSessionDao {

	@Autowired
	JwtSessionRepository repository;

	@Override
	public Boolean isValidToken(String jwt) {
		return repository.findBytoken(jwt) == null ? false : true;
	}

	@Override
	public String saveToken(JwtSessionEntity entity) {

		return repository.save(entity).getToken();
	}

}
