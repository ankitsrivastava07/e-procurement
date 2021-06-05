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
import user.service.CreateUserResponseStatus;
import user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@PostMapping("/login")
	public ResponseEntity<?> createAuthenticationToken(@RequestBody UserCredential userCredentail,
			HttpServletResponse response) throws Exception {

		LoginStatus loginStatus = userService.findByEmailAndPassword(userCredentail.getEmail(),
				userCredentail.getPassword());

		return new ResponseEntity<>(loginStatus, HttpStatus.OK);
	}

	@PostMapping("/get-first-name")
	public String getFirstName(@RequestBody Long userId) {
		return userService.getFirstName(userId);
	}

	@PostMapping("/change-password")
	public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequestDto changePasswordRequest) {

		ChangePasswordResponseStatus changePasswordResponseStatus = userService.changePassword(changePasswordRequest);

		return new ResponseEntity<>(changePasswordResponseStatus, HttpStatus.OK);
	}

	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody CreateUserRequestDto createUserRequestDto,
			HttpServletResponse response) throws Exception {

		CreateUserResponseStatus responseStatus = userService.register(createUserRequestDto);

		return new ResponseEntity<>(responseStatus, HttpStatus.OK);
	}

}