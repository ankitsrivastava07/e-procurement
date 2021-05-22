package user.dao;

import user.dao.entity.LoginEntity;

public interface UserDao {

	LoginEntity findByUserNameAndPassword(String username, String password);

	Boolean isUserBlocked(String username);

	String findByUserName(String username);

	String getFirstName(Long id);

	void changePassword(String password, Long id);

}
