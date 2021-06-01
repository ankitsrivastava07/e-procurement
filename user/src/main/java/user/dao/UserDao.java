package user.dao;

import user.dao.entity.LoginEntity;
import user.dao.entity.UserDetailEntity;

public interface UserDao {

	LoginEntity findByEmailAndPassword(String email, String password);

	Boolean isUserBlocked(String email);

	Integer findByEmailOrMobile(String email);

	String getFirstName(Long id);

	void changePassword(String password, Long id);

	void register(UserDetailEntity userDetailEntity);
	
}
