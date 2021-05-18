package frontend.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import frontend.controller.LoginStatus;
import frontend.controller.UserCredential;

@FeignClient(name = "api-gateway", url = "localhost:8081")
public interface AuthenitcationServiceProxy {

	@GetMapping("/logout")
	public void logout();

	@PostMapping("/users/login")
	public ResponseEntity<LoginStatus> createAuthenticationToken(@RequestBody UserCredential userCredential);

	@GetMapping("/")
	void home();

}
