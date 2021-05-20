package jwtsession.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import jwtsession.jwtutil.JwtTokenUtil;
import jwtsession.service.JwtSessionService;

@RestController
@RequestMapping("token-session")
public class JwtSessionController {

	@Autowired
	private JwtSessionService jwtSessionService;

	@Autowired
	TokenStatus tokenStatus;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@PostMapping("/change-password")
	public void changePassword(HttpServletRequest request) {

	}

	@PostMapping("/save-token")
	public ResponseEntity<?> saveToken(@RequestBody JwtSessionDto tokenDto) {

		TokenStatus tokenStatus = jwtSessionService.saveToken(tokenDto);

		System.out.println(tokenDto);

		return new ResponseEntity<>(tokenStatus, HttpStatus.OK);

	}

	@PostMapping("/validate-token")
	public ResponseEntity<?> isValidToken(@RequestBody(required = true) String jwt, HttpServletRequest request) {

		TokenStatus tokenStatus = jwtSessionService.isValidToken(jwt);

		return new ResponseEntity<>(tokenStatus, HttpStatus.OK);
	}

	@PostMapping("/invalidate-token")
	public ResponseEntity<?> invalidateToken(@RequestBody String token) {

		TokenStatus tokenStatus = jwtSessionService.removeToken(token);
		return new ResponseEntity<>(tokenStatus,HttpStatus.OK);
	}

}
