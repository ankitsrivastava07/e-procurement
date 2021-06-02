package user.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import user.controller.ChangePasswordRequestDto;

@FeignClient(name = "jwt-session", url = "localhost:8082")
public interface JwtSessionServiceProxy {

	@PostMapping(value = "/token-session/save-token")
	ResponseEntity<TokenStatus> generateToken(@RequestBody Long userId);

	@PostMapping("/token-session/invalidate-tokens")
	public ResponseEntity<?> invalidateTokens(@RequestBody ChangePasswordRequestDto dto);

	@PostMapping("/token-session/validate-token")
	public ResponseEntity<?> isValidToken(@RequestBody(required = true) String jwt);

}
