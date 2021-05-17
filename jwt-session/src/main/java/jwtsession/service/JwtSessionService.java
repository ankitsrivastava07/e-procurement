package jwtsession.service;

import jwtsession.controller.JwtSessionDto;

public interface JwtSessionService {

	Boolean isValidToken(String jwt);

	String saveToken(JwtSessionDto tokenDto);
}
