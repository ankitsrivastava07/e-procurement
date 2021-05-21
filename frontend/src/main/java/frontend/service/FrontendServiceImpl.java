package frontend.service;

import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frontend.controller.ChangePasswordRequestDto;
import frontend.controller.LoginStatus;

@Service
public class FrontendServiceImpl implements FrontendService {

	@Autowired
	JwtSessionProxy jwtSessionProxy;

	@Autowired
	AuthenitcationServiceProxy user;

	@Override
	public void setCookie(HttpServletRequest request, HttpServletResponse response, LoginStatus status) {

		Cookie cookies[] = request.getCookies();

		if (cookies != null)

			for (Cookie cookie : cookies)

				if (cookie.getName().equalsIgnoreCase("session_Token")) {
					cookie.setValue(status.getToken());
					response.addCookie(cookie);
					return;
				}

		Cookie cookie = new Cookie("session_Token", status.getToken());

		response.addCookie(cookie);

	}

	public String getToken(HttpServletRequest request) {

		Cookie cookies[] = request.getCookies();

		String userName = null;

		if (cookies != null)

			for (Cookie cookie : cookies)

				if (cookie.getName().equalsIgnoreCase("session_Token"))
					return userName = cookie.getValue();

		return userName;
	}

	public TokenStatus isValidToken(HttpServletRequest request) {

		String token = getToken(request);

		TokenStatus tokenStatus = null;

		if (Objects.nonNull(token) && !token.isEmpty()) {

			tokenStatus = jwtSessionProxy.isValidToken(token).getBody();

			return tokenStatus;
		}

		return null;
	}

	public void invalidateToken(HttpServletRequest request) {

		String token = getToken(request);

		TokenStatus tokenStatus = null;

		if (Objects.nonNull(token) && !token.isEmpty())

			tokenStatus = jwtSessionProxy.invalidateToken(token).getBody();

	}

	@Override
	public ChangePasswordResponseStatus changePassword(ChangePasswordRequestDto changePasswordRequest) {
		ChangePasswordResponseStatus changePasswordResponseStatus = user.changePassword(changePasswordRequest)
				.getBody();

		return changePasswordResponseStatus;
	}

}
