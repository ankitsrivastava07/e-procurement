
package user.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.dao.UserDao;
import user.dao.entity.UserEntity;
import user.exceptionHandle.InvalidCredentialException;
import user.exceptionHandle.UserBlockedException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public void isUserBlocked(String username) {
		Boolean isBlocked = userDao.isUserBlocked(username);

		if (Objects.nonNull(isBlocked) && isBlocked != false)
			throw new UserBlockedException("Your account has been blocked for 24 hours");
	}

	@Override
	public UserEntity findByUserNameAndPassword(String username, String password) {

		isUserBlocked(username);

		UserEntity entity = userDao.findByUserNameAndPassword(username, password);

		if (Objects.isNull(entity)) {
			throw new InvalidCredentialException("Invalid username or password which you have provided");
		}

		return entity;
	}

	@Override
	public String findByUserName(String username) {

		return userDao.findByUserName(username);
	}

}
