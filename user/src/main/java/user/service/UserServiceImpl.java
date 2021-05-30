
package user.service;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.configure.JwtTokenUtil;
import user.constant.ResponseStatus;
import user.controller.ChangePasswordRequestDto;
import user.controller.ChangePasswordResponseStatus;
import user.controller.LoginStatus;
import user.dao.UserDao;
import user.dao.entity.LoginEntity;
import user.exceptionHandle.InvalidCredentialException;
import user.exceptionHandle.UserBlockedException;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Autowired
	private ChangePasswordResponseStatus changePasswordResponseStatus;

	@Autowired
	JwtTokenUtil jwtTokenUtil;

	@Autowired
	private JwtSessionServiceProxy jwtSessionServiceProxy;

	public void isUserBlocked(String username) {
		Boolean isBlockend = userDao.isUserBlocked(username);

		if (Objects.nonNull(isBlockend) && isBlockend)
			throw new UserBlockedException("Your account has been blocked for 24 hours");
	}

	@Override
	public LoginStatus findByUserNameAndPassword(String username, String password) {

		isUserBlocked(username);

		LoginEntity entity = userDao.findByUserNameAndPassword(username, password);

		if (Objects.isNull(entity))
			throw new InvalidCredentialException("Invalid username or password");

		String token = jwtTokenUtil.generateToken(entity.getUserName(), entity.getUserId());

		jwtSessionServiceProxy.saveToken(jwtTokenUtil.generateToken(entity.getUserName(), entity.getUserId()));

		String firstName = getFirstName(token);

		LoginStatus loginStatus = new LoginStatus();

		loginStatus.setStatus(ResponseStatus.TRUE);
		loginStatus.setMessage(ResponseStatus.MESSAGE);

		loginStatus.setToken(token);
		loginStatus.setFirstName(firstName);

		return loginStatus;
	}

	@Override
	public String findByUserName(String username) {
		return userDao.findByUserName(username);
	}

	@Override
	public String getFirstName(String token) {
		Long id = jwtTokenUtil.getUserId(token);
		return userDao.getFirstName(id);
	}

	@Override
	public ChangePasswordResponseStatus changePassword(ChangePasswordRequestDto dto) {

		Map<String, String> map = dto.getToken();

		if (map == null || map.isEmpty())
			throw new InvalidTokenException("Invalid Token or token does not exist");

		Long id = jwtTokenUtil.getUserId(map.get("token"));

		String password = map.get("password");

		userDao.changePassword(password, id);

		changePasswordResponseStatus.setMessage(ResponseStatus.MESSAGE);
		changePasswordResponseStatus.setStatus(ResponseStatus.TRUE);

		jwtSessionServiceProxy.invalidateTokens(dto);

		return changePasswordResponseStatus;

	}

}
