package user.constant;

import java.time.LocalDateTime;

public class ResponseStatus {

	public static final Boolean TRUE = true;
	public static final Boolean FALSE = false;
	public static final String MESSAGE = "Success";

	public static LocalDateTime getLocalDateTime() {
		return LocalDateTime.now();
	}
}
