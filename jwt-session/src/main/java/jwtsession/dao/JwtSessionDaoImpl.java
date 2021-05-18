package jwtsession.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jwtsession.dao.entity.JwtSessionEntity;
import jwtsession.dao.repository.JwtSessionRepository;
import jwtsession.exceptionHandle.InvalidTokenException;

@Repository
public class JwtSessionDaoImpl implements JwtSessionDao {

	@Autowired
	JwtSessionRepository repository;

	@Override
	public String getUsername(String jwt) {

		String username = repository.findBytoken(jwt).getUserName();

		if (username == null)
			throw new InvalidTokenException("Invalid Token or token does not exist");

		return repository.findBytoken(jwt).getUserName();
	}

	@Override
	public String saveToken(JwtSessionEntity entity) {

		return repository.save(entity).getToken();
	}

}
