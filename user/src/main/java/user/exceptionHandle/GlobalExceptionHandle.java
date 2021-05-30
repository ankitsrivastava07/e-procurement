package user.exceptionHandle;

import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {

	@ExceptionHandler(UserNameOrEmailNotFoundException.class)
	public ResponseEntity<?> userNameNotFound(UserNameOrEmailNotFoundException exception) {

		/*
		 * ApiError apiError = new ApiError(new Date(), HttpStatus.OK.value(),
		 * HttpStatus.OK.name(), exception.getMessage(), path.getRequestURI());
		 */
		LoginStatus loginStatus = new LoginStatus();

		loginStatus.setStatus(Boolean.FALSE);
		loginStatus.setMessage(exception.getMessage());

		return new ResponseEntity<>(loginStatus, HttpStatus.OK);
	}

	@ExceptionHandler(InvalidCredentialException.class)
	public ResponseEntity<?> invalidCredential(InvalidCredentialException exception) {

		LoginStatus loginStatus = new LoginStatus();
		loginStatus.setStatus(Boolean.FALSE);
		loginStatus.setMessage(exception.getMessage());

		return new ResponseEntity<>(loginStatus, HttpStatus.OK);

	}

	@ExceptionHandler(UserBlockedException.class)
	public ResponseEntity<?> userBlocked(UserBlockedException exception) {

		LoginStatus loginStatus = new LoginStatus();
		loginStatus.setStatus(Boolean.FALSE);
		loginStatus.setMessage(exception.getMessage());

		return new ResponseEntity<>(loginStatus, HttpStatus.OK);
	}

	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ResponseEntity<?> httpMethodNotSupported(HttpRequestMethodNotSupportedException ex,HttpServletRequest request) {
		ApiError apiError = new ApiError(new Date(), HttpStatus.METHOD_NOT_ALLOWED.value(),
				HttpStatus.METHOD_NOT_ALLOWED.name(), ex.getMessage(), request.getRequestURL().toString(),ex.getSupportedMethods());

		return new ResponseEntity<>(apiError, HttpStatus.METHOD_NOT_ALLOWED);
	}
}
