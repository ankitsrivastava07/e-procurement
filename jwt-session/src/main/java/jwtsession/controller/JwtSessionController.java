package jwtsession.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import jwtsession.jwtutil.JwtTokenUtil;
import jwtsession.service.JwtSessionService;

@RequestMapping("token-session")
@RestController
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

	@GetMapping("/logout")
	public ModelAndView logout(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@PostMapping("/save-token")
	public void saveToken(@RequestBody JwtSessionDto tokenDto) {

		jwtSessionService.saveToken(tokenDto);

		System.out.println(tokenDto);

	}

	@PostMapping("/validate-token")
	public ResponseEntity<?> isValidToken(@RequestBody(required = true) String jwt, HttpServletRequest request) {

		String userName = jwtTokenUtil.getUsernameFromToken(jwt);

		jwtTokenUtil.validateToken(jwt);

		Boolean flag = jwtSessionService.isValidToken(jwt);

		System.out.println(flag);

		tokenStatus.setMessage("Invalid token");
		tokenStatus.setStatus(Boolean.FALSE);
		tokenStatus.setToken(jwt);

		return new ResponseEntity<>(tokenStatus, HttpStatus.OK);
	}

	/*
	 * @PostMapping("/invalidate-token") public void invalidateToken(@RequestBody
	 * String jwt, HttpServletRequest request) {
	 * 
	 * HttpSession session = request.getSession(false);
	 * 
	 * String token = (String) session.getAttribute("jwt_token");
	 * 
	 * if (Objects.nonNull(jwt) && !jwt.equals(token)) {
	 * 
	 * }
	 * 
	 * // String userName = jwtTokenUtil.getUserIdFromToken(jwt);
	 * 
	 * // jwtTokenUtil.validateToken(jwt, Long.valueOf(userName));
	 * System.out.println("hhh"); }
	 */
}
