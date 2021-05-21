package user.exceptionHandle;

public class UserNotFoundException extends RuntimeException{

	private static final long serialVersionUID = -1553122253671285203L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
