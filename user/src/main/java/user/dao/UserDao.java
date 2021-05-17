package user.dao;

import user.dao.entity.UserEntity;

public interface UserDao {

	UserEntity findByUserNameAndPassword(String username, String password);

	Boolean isUserBlocked(String username);

	String findByUserName(String username);
}
