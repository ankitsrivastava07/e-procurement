package jwtsession.controller;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class TokenStatus {

	private boolean status;

	private String message;

	private String token;
	
	private String firstName;
}
