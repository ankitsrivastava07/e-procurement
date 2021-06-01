package jwtsession.dao;

import jwtsession.dao.entity.JwtSessionEntity;

public interface JwtSessionDao {

	JwtSessionEntity isValidToken(String jwt);

	String saveToken(JwtSessionEntity entity);

	Integer removeToken(String token);

	Boolean isTokenExist(String token);
}