package user.dao;

import java.time.LocalDateTime;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import user.dao.entity.LoginEntity;
import user.dao.entity.UserDetailEntity;
import user.dao.repository.LoginRepository;
import user.dao.repository.UserDetailRepository;
import user.exceptionHandle.EmailAlreadyExistException;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private LoginRepository loginRepository;

	@Autowired
	UserDetailRepository userDetailRepository;

	@Override
	public LoginEntity findByEmailAndPassword(String email, String password) {

		return loginRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public Boolean isUserBlocked(String email) {
		return loginRepository.isUserBlocked(email);
	}

	@Override
	public Integer findByEmailOrMobile(String username) {
		
		return loginRepository.findByEmailOrMobile(username)==null ? 0: 1;
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
			throw new EmailAlreadyExistException("User not found Exception");

		LoginEntity loginEntity = entity.get();

		loginEntity.setOldPassword(loginEntity.getNewPassword());

		loginEntity.setCreatedAt(LocalDateTime.now());

		loginEntity.setNewPassword(password);

		loginRepository.save(loginEntity);
	}

	@Override
	public void register(UserDetailEntity userDetailEntity) {
	
		UserDetailEntity userDetailEntity2= userDetailRepository.save(userDetailEntity);
		
	}

}
