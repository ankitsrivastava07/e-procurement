package api.exceptionHandle;

import java.util.Date;
import java.util.Map;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class ValidationError {

	private Map<String, String> fieldsError;

	private Date timestamp;

	private HttpStatus status;

	private String error;

	private Boolean validationStatus;

	public ValidationError(Map<String, String> fiedError, HttpStatus status, String message, Boolean validationStatus,
			Date timestamp) {

		this.fieldsError = fiedError;
		this.status = status;
		this.error = message;
		this.validationStatus = validationStatus;
		this.timestamp = timestamp;
	}

}
