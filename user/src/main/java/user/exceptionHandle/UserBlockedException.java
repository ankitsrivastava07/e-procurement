package user.exceptionHandle;

public class UserBlockedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UserBlockedException(String message) {
		super(message);
	}

}
