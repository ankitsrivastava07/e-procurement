package jwtsession.jwtutil;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "users", url = "localhost:8081")
public interface JwtSessionServiceProxy {

	@PostMapping("/users/get-first-name")
	public String getFirstName(@RequestBody Long userId);
}
