package zuulapigateway.filter;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TokenStatus {

	private boolean status;

	private String message;
	
	private LocalDateTime createdAt;
	
	private String token;

	private String firstName;
}
