
package user.service;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import user.configure.JwtTokenUtil;
import user.constant.ResponseStatus;
import user.controller.ChangePasswordRequestDto;
import user.controller.ChangePasswordResponseStatus;
import user.controller.CreateUserRequestDto;
import user.controller.LoginStatus;
import user.dao.UserDao;
import user.dao.entity.LoginEntity;
import user.dao.entity.UserDetailEntity;
import user.exceptionHandle.EmailAlreadyExistException;
import user.exceptionHandle.InvalidCredentialException;
import user.exceptionHandle.MobileNumberAlreadyExistException;
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

	public void isUserBlocked(String email) {
		Boolean isBlockend = userDao.isUserBlocked(email);

		if (Objects.nonNull(isBlockend) && isBlockend)
			throw new UserBlockedException("Your account has been blocked for 24 hours");
	}

	@Override
	public LoginStatus findByEmailAndPassword(String email, String password) {

		isUserBlocked(email);

		LoginEntity entity = userDao.findByEmailAndPassword(email, password);

		if (Objects.isNull(entity))
			throw new InvalidCredentialException("Invalid username or password");

		String token = jwtTokenUtil.generateToken(entity.getId());

		jwtSessionServiceProxy.saveToken(jwtTokenUtil.generateToken(entity.getId()));

		String firstName = getFirstName(token);

		LoginStatus loginStatus = new LoginStatus();

		loginStatus.setStatus(ResponseStatus.TRUE);
		loginStatus.setMessage(ResponseStatus.MESSAGE);

		loginStatus.setToken(token);
		loginStatus.setFirstName(firstName);

		return loginStatus;
	}

	@Override
	public void findByEmailOrMobile(CreateUserRequestDto createUserRequestDto) {

		if (createUserRequestDto.getEmail()!=null && userDao.findByEmailOrMobile(createUserRequestDto.getEmail()) != 0)
			throw new EmailAlreadyExistException("Some one already registered with this email");

		if (userDao.findByEmailOrMobile(createUserRequestDto.getMobile()) != 0)
			throw new MobileNumberAlreadyExistException("Mobile number already taken");

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

	@Override
	public CreateUserResponseStatus register(CreateUserRequestDto createUserRequestDto) {

		findByEmailOrMobile(createUserRequestDto);

		UserDetailEntity userDetailEntity = new UserDetailEntity();

		userDetailEntity.setFirstName(createUserRequestDto.getFirstName());
		userDetailEntity.setLastName(createUserRequestDto.getLastName());

		LoginEntity loginEntity = new LoginEntity();

		loginEntity.setMobile(createUserRequestDto.getMobile());
		loginEntity.setEmail(createUserRequestDto.getEmail());
		loginEntity.setNewPassword(createUserRequestDto.getPassword());
		loginEntity.setIsBlocked(Boolean.FALSE);

		userDetailEntity.setLoginId(loginEntity);

		userDao.register(userDetailEntity);

		CreateUserResponseStatus responseStatus = new CreateUserResponseStatus();
		responseStatus.setMessage(ResponseStatus.MESSAGE);
		responseStatus.setStatus(ResponseStatus.TRUE);
		responseStatus.setCreatedAt(ResponseStatus.getLocalDateTime());

		return responseStatus;
	}

}