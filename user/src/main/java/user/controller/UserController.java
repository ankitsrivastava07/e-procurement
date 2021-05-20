package user.controller;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.configure.JwtTokenUtil;
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

		LoginStatus loginStatus = userService.findByUserNameAndPassword(userCredentail.getUserName(),
				userCredentail.getPassword());

		return new ResponseEntity<>(loginStatus, HttpStatus.OK);
	}

	@PostMapping("/get-first-name")
	public String getFirstName(@RequestBody Long userId) {
		return userService.getFirstName(userId);
	}

}