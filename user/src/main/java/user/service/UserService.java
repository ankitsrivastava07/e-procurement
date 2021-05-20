package user.service;

import user.controller.LoginStatus;

public interface UserService {

	LoginStatus findByUserNameAndPassword(String username, String password);

	void isUserBlocked(String username);

	String findByUserName(String username);

	String getFirstName(Long userId);

}
