package api.exceptionHandle;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandle {

	@Autowired
	private HttpServletRequest path;

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> methodArgumentNotValidException(MethodArgumentNotValidException ex) {
		BindingResult result = ex.getBindingResult();
		List<FieldError> fieldErrors = result.getFieldErrors();
		return new ResponseEntity<>(processFieldErrors(fieldErrors), HttpStatus.OK);
	}

	private ValidationError processFieldErrors(List<FieldError> fieldErrors) {

		Map<String, String> map = new HashMap<>();

		for (org.springframework.validation.FieldError fieldError : fieldErrors) {
			map.put(fieldError.getField(), fieldError.getDefaultMessage());
		}

		ValidationError error = new ValidationError(map, HttpStatus.BAD_REQUEST, "validation failed", Boolean.FALSE,
				new Date());

		return error;
	}

}
