package user.exceptionHandle;

public class MobileNumberAlreadyExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public MobileNumberAlreadyExistException(String message) {
		super(message);
	}

}
