package frontend.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "jwt-session", url = "localhost:8082")
public interface JwtSessionProxy {

	@PostMapping("/token-session/validate-token")
	public ResponseEntity<TokenStatus> isValidToken(@RequestBody String jwt);

	@PostMapping("/token-session/invalidate-token")
	public ResponseEntity<TokenStatus> invalidateToken(@RequestBody String token);

}