package jwtsession.dao;

import jwtsession.controller.TokenStatus;
import jwtsession.dao.entity.JwtSessionEntity;

public interface JwtSessionDao {

	Boolean isValidToken(String jwt);

	String saveToken(JwtSessionEntity entity);
	
	JwtSessionEntity removeToken(String token);
	
	TokenStatus removeAllTokensById(Long user_id);
}
