package jwtsession.dao;

import jwtsession.dao.entity.JwtSessionEntity;

public interface JwtSessionDao {

	Boolean isValidToken(String jwt);

	String saveToken(JwtSessionEntity entity);
	
	JwtSessionEntity removeToken(String token);
}
