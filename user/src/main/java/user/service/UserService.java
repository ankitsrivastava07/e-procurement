package user.service;

import user.dao.entity.UserEntity;

public interface UserService {

	UserEntity findByUserNameAndPassword(String username, String password);

	void isUserBlocked(String username);

	String findByUserName(String username);
}
