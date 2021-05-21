package user.service;

import user.controller.ChangePasswordRequestDto;
import user.controller.ChangePasswordResponseStatus;
import user.controller.LoginStatus;

public interface UserService {

	LoginStatus findByUserNameAndPassword(String username, String password);

	void isUserBlocked(String username);

	String findByUserName(String username);

	String getFirstName(String token);

	ChangePasswordResponseStatus changePassword(ChangePasswordRequestDto dto);

}
