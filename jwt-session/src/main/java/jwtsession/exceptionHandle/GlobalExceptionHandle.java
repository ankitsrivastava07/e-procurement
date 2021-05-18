package jwtsession.exceptionHandle;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {

	@Autowired
	private HttpServletRequest path;

	@ExceptionHandler(InvalidTokenException.class)
	public ResponseEntity<?> userNameNotFound(InvalidTokenException exception) {

		TokenStatus tokenStatus = new TokenStatus();

		tokenStatus.setStatus(Boolean.FALSE);
		tokenStatus.setMessage(exception.getMessage());

		return new ResponseEntity<>(tokenStatus, HttpStatus.OK);
	}

}
