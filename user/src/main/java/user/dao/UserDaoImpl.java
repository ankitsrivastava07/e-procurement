package user.dao;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import user.dao.entity.LoginEntity;
import user.dao.entity.UserDetailEntity;
import user.dao.repository.LoginRepository;
import user.dao.repository.UserDetailRepository;
import user.exceptionHandle.UserNotFoundException;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	UserDetailRepository userDetailRepository;

	@Override
	public LoginEntity findByUserNameAndPassword(String username, String password) {

		return loginRepository.findByUserNameAndPassword(username.toLowerCase(), password);
	}

	@Override
	public Boolean isUserBlocked(String username) {
		return loginRepository.isUserBlocked(username.toLowerCase());
	}

	@Override
	public String findByUserName(String username) {
		return loginRepository.findByUserName(username).getUserName();

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

	@Override
	public void changePassword(String password, Long id) {

		Optional<LoginEntity> entity = loginRepository.findById(id);

		if (entity.isEmpty())
			throw new UserNotFoundException("User not found Exception");

		LoginEntity loginEntity = entity.get();

		loginEntity.setOldPassword(loginEntity.getNewPassword());

		loginEntity.setCreatedAt(LocalDateTime.now());

		loginEntity.setNewPassword(password);

		loginRepository.save(loginEntity);

	}

}
