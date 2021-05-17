package user.exceptionHandle;

import lombok.Data;

@Data
public class LoginStatus {

	private boolean status;

	private String message;

	private String token;
}
