package user.exceptionHandle;

public class EmailAlreadyExistException extends RuntimeException{

	private static final long serialVersionUID = -1553122253671285203L;

	public EmailAlreadyExistException(String message) {
		super(message);
	}

}
