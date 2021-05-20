package jwtsession.service;

import jwtsession.controller.JwtSessionDto;
import jwtsession.controller.TokenStatus;

public interface JwtSessionService {

	TokenStatus isValidToken(String jwt);

	TokenStatus saveToken(JwtSessionDto tokenDto);

	TokenStatus removeToken(String token);
}
