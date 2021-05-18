package frontend.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "jwt-session", url = "localhost:8082",primary = false)
public interface FrontendServiceProxy {

	@GetMapping("/")
	void home();

	@PostMapping("/token-session/validate-token")
	public ResponseEntity<TokenStatus> getUsernameFromToken(@RequestBody(required = true) String jwt);

}
