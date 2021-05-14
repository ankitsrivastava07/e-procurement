package frontend.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");

		return mv;
	}

	@GetMapping("/register")
	public ModelAndView register() {
		int cnt = 1;
		if (cnt == 1)
			throw new NullPointerException("Exception");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		return mv;
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody UserCredential userCredential, HttpServletRequest request)
			throws JsonProcessingException {

		return null;
	}

	@GetMapping("/logout")
	public ResponseEntity<?> logout(HttpServletRequest request) throws JsonProcessingException {

		String tocken = request.getHeader("Authorization");

		System.out.println("Log out");

		return null;
	}

}