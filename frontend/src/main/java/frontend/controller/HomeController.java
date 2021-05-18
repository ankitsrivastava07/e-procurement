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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;

import frontend.service.AuthenitcationServiceProxy;
import frontend.service.FrontendService;
import frontend.service.HomeControllerProxy;

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

		String username = frontendService.isTokenExist(request);

		model.addObject("userName", username);

		return model;
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserCredential userCredential, HttpServletRequest request,
			HttpServletResponse response) throws JsonProcessingException {

		ResponseEntity<LoginStatus> status = proxy.createAuthenticationToken(userCredential);

		LoginStatus loginStatus = status.getBody();

		if (loginStatus.isStatus()) {
			frontendService.setCookie(request, response, loginStatus);
			homeControllerProxy.home();

			ModelAndView model = new ModelAndView();
			model.setViewName("index");

			String username = frontendService.isTokenExist(request);

			model.addObject("userName", username);

//			RequestDispatcher dispatcher = request.getServletContext();

			// RequestDispatcher dispatcher = request.getServletContext();

		}

		return new ResponseEntity<>(loginStatus, HttpStatus.OK);
	}

	@GetMapping("/logout")
	public ResponseEntity<?> logout(HttpServletRequest request) throws JsonProcessingException {

		String tocken = request.getHeader("Authorization");

		System.out.println("Log out");

		return null;
	}

	@GetMapping("/register")
	public ModelAndView register() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}
}