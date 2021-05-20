package user.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import user.dao.entity.LoginEntity;
import user.dao.entity.UserDetailEntity;
import user.dao.repository.LoginRepository;
import user.dao.repository.UserDetailRepository;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private LoginRepository userRepository;

	@Autowired
	UserDetailRepository userDetailRepository;

	@Override
	public LoginEntity findByUserNameAndPassword(String username, String password) {
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

	@Override
	public String getFirstName(Long id) {

		Optional<UserDetailEntity> entity = userDetailRepository.findById(id);

		if (entity.isPresent()) {
			UserDetailEntity user = entity.get();
			return user.getFirstName();
		}
		return null;
	}

}
