package user.service;

import user.controller.ChangePasswordRequestDto;
import user.controller.ChangePasswordResponseStatus;
import user.controller.CreateUserRequestDto;
import user.controller.LoginStatus;

public interface UserService {

	LoginStatus findByEmailAndPassword(String email, String password);

	void isUserBlocked(String username);

	void findByEmailOrMobile(CreateUserRequestDto createUserRequestDto);

	String getFirstName(String token);

	ChangePasswordResponseStatus changePassword(ChangePasswordRequestDto changePasswordRequest);

	CreateUserResponseStatus register(CreateUserRequestDto createUserRequestDto);

}
