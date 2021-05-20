
package user.service;

import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.configure.JwtTokenUtil;
import user.constant.TokenStatusConstant;
import user.controller.LoginStatus;
import user.controller.TokenUtil;
import user.dao.UserDao;
import user.dao.entity.LoginEntity;
import user.exceptionHandle.InvalidCredentialException;
import user.exceptionHandle.UserBlockedException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Autowired
	TokenUtil tokenUtil;

	@Autowired
	private UserServiceProxy userServiceProxy;

	public void isUserBlocked(String username) {
		Boolean isBlocked = userDao.isUserBlocked(username);

		if (Objects.nonNull(isBlocked) && isBlocked != false)
			throw new UserBlockedException("Your account has been blocked for 24 hours");
	}

	@Override
	public LoginStatus findByUserNameAndPassword(String username, String password) {

		isUserBlocked(username);

		LoginEntity entity = userDao.findByUserNameAndPassword(username, password);

		if (Objects.isNull(entity))
			throw new InvalidCredentialException("Invalid username or password");

		String token = jwtTokenUtil.generateToken(entity.getUserName(), entity.getUserId());

		tokenUtil.setToken(token);
		tokenUtil.setUserId(entity.getUserId());

		userServiceProxy.saveToken(tokenUtil);

		String firstName = getFirstName(entity.getUserId());

		LoginStatus loginStatus = new LoginStatus();

		loginStatus.setStatus(TokenStatusConstant.TRUE);
		loginStatus.setMessage(TokenStatusConstant.MESSAGE);

		loginStatus.setToken(token);
		loginStatus.setFirstName(firstName);

		return loginStatus;
	}

	@Override
	public String findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public String getFirstName(Long id) {
		return userDao.getFirstName(id);
	}

}
