package jwtsession.dao;

import jwtsession.dao.entity.JwtSessionEntity;

public interface JwtSessionDao {

	String getUsername(String jwt);

	String saveToken(JwtSessionEntity entity);
}
