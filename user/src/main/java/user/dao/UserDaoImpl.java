package user.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import user.dao.entity.UserEntity;
import user.dao.repository.UserRepository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserEntity findByUserNameAndPassword(String username, String password) {
		return userRepository.findByUserNameAndPassword(username.toLowerCase(), password);
	}

	@Override
	public Boolean isUserBlocked(String username) {
		return userRepository.isUserBlocked(username.toLowerCase());
	}

	@Override
	public String findByUserName(String username) {
		return userRepository.findByUserName(username).getUserName();

	}

}
