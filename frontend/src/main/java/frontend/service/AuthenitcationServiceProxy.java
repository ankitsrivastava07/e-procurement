package frontend.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import frontend.controller.ChangePasswordRequestDto;
import frontend.controller.LoginStatus;
import frontend.controller.UserCredential;

@FeignClient(name = "users", url = "localhost:8081")
public interface AuthenitcationServiceProxy {

	@PostMapping("/users/login")
	public ResponseEntity<LoginStatus> createAuthenticationToken(@RequestBody UserCredential userCredential);

	@PostMapping("/users/change-password")
	public ResponseEntity<ChangePasswordResponseStatus> changePassword(@RequestBody ChangePasswordRequestDto changePasswordRequest);

	@PostMapping("/users/get-first-name")
	public ResponseEntity<String> getFirstName(@RequestBody String token);

}
