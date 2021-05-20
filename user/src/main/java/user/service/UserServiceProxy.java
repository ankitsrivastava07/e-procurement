package user.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import user.controller.TokenStatus;
import user.controller.TokenUtil;

@FeignClient(name = "jwt-session", url = "localhost:8082")
public interface UserServiceProxy {

	@PostMapping(value = "/token-session/save-token")
	public ResponseEntity<TokenStatus> saveToken(@RequestBody TokenUtil tokenUtil);

	/*
	 * @PostMapping(value = "/token-session/save-token") public void
	 * isTokenExist(@RequestBody String token);
	 */
}
