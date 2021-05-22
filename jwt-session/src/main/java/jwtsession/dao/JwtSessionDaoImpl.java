package jwtsession.dao;

import java.util.Objects;
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
	public Boolean isValidToken(String token) {
		return repository.findBytoken(token) == null ? false : true;
	}

	@Override
	public String saveToken(JwtSessionEntity entity) {
		return repository.save(entity).getToken();
	}

	@Transactional
	@Override
	public JwtSessionEntity removeToken(String token) {

		JwtSessionEntity entity = repository.findBytoken(token);

		if (Objects.isNull(entity))
			return null;

		repository.deleteById(entity.getId());

		return entity;
	}
}
