package jwtsession.service;

import jwtsession.controller.TokenStatus;

public interface JwtSessionService {

	TokenStatus isValidToken(String jwt);

	TokenStatus saveToken(String token);

	TokenStatus removeToken(String token);

	TokenStatus removeAllTokensById(Long user_id);
}
