package frontend.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;

import frontend.service.AuthenitcationServiceProxy;
import frontend.service.ChangePasswordResponseStatus;
import frontend.service.FrontendService;
import frontend.service.HomeControllerProxy;
import frontend.service.TokenStatus;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private FrontendService frontendService;
	@Autowired
	private HomeControllerProxy homeControllerProxy;

	@Autowired
	private AuthenitcationServiceProxy proxy;

	@GetMapping({ "/", "/home" })
	public ModelAndView home(HttpServletRequest request) {

		ModelAndView model = new ModelAndView();
		model.setViewName("index");

		TokenStatus tokenStatus = frontendService.isValidToken(request);

		if (tokenStatus != null)
			model.addObject("userName", tokenStatus.getFirstName());

		return model;
	}

	@RequestMapping(value = "/login", method = { RequestMethod.POST })
	public ResponseEntity<?> login(@RequestBody UserCredential userCredential, HttpServletRequest request,
			HttpServletResponse response) throws JsonProcessingException {

		ResponseEntity<LoginStatus> status = proxy.createAuthenticationToken(userCredential);

		LoginStatus loginStatus = status.getBody();

		if (loginStatus.isStatus()) {
			frontendService.setCookie(request, response, loginStatus);
			ModelAndView model = new ModelAndView();
			model.addObject("userName", loginStatus.getFirstName());
		}

		return new ResponseEntity<>(loginStatus.getMessage(), HttpStatus.OK);

	}

	@GetMapping("/signout")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response)
			throws JsonProcessingException {

		System.out.println("sign out");

		frontendService.invalidateToken(request);

		return new ModelAndView("redirect:" + "/");
	}

	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@GetMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();

		TokenStatus tokenStatus = frontendService.isValidToken(request);

		if (tokenStatus != null && tokenStatus.isStatus())
			return new ModelAndView("redirect:" + "/");

		mv.setViewName("login");
		return mv;
	}

	@GetMapping("/change-password")
	public ModelAndView changePasswod(HttpServletRequest request) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("change-password");

		TokenStatus tokenStatus = frontendService.isValidToken(request);

		if (tokenStatus == null || tokenStatus != null && !tokenStatus.isStatus())
			return new ModelAndView("redirect:/" + "login");

		return mv;
	}

	@PostMapping("/change-password")
	public ResponseEntity<?> changePassword(@RequestHeader(value = "session_Token") String token,
			@RequestBody ChangePasswordReqest req, HttpServletRequest request) {

		ChangePasswordResponseStatus status = frontendService.changePassword(req.getPassword(), token);

		return new ResponseEntity<>(status.getMessage(), HttpStatus.OK);
	}

	@GetMapping("/signout-from-alldevices")
	public ModelAndView signOutFromAllDevices(HttpServletRequest request) {

		TokenStatus tokenStatus = frontendService.isValidToken(request);

		if (tokenStatus == null || tokenStatus != null && !tokenStatus.isStatus())
			return new ModelAndView("redirect:/" + "login");

		frontendService.removeAllTokens(request);

		return new ModelAndView("redirect:" + "/");
	}

}