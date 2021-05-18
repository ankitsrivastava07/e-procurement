package user.controller;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.configure.JwtTokenUtil;
import user.dao.entity.UserEntity;
import user.service.UserService;
import user.service.UserServiceProxy;

@RestController
@RequestMapping("users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserServiceProxy userServiceProxy;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@PostMapping("/login")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody UserCredential userCredentail,
			HttpServletResponse response) throws Exception {

		UserEntity entity = userService.findByUserNameAndPassword(userCredentail.getUserName(),
				userCredentail.getPassword());

		String token = jwtTokenUtil.generateToken(entity.getUserName());

		TokenUtil tokenUtil = new TokenUtil();

		tokenUtil.setUsername(entity.getUserName());

		tokenUtil.setToken(token);

		userServiceProxy.saveToken(tokenUtil);

		LoginStatus login = new LoginStatus();

		login.setStatus(Boolean.TRUE);
		login.setMessage("Success");

		login.setToken(token);
		return new ResponseEntity<>(login, HttpStatus.OK);
	}

	@PostMapping("/token-exist")
	public ResponseEntity<String> getFirstNameFromToken(@RequestBody String jwt) {

		String userName = jwtTokenUtil.getUsernameFromToken(jwt);

		return new ResponseEntity<>(userService.findByUserName(userName), HttpStatus.OK);
	}

}