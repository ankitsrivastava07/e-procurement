package jwtsession.service;

import jwtsession.controller.JwtSessionDto;

public interface JwtSessionService {

	String getUsername(String jwt);

	String saveToken(JwtSessionDto tokenDto);
}
