package frontend.service;

import java.util.Objects;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import frontend.controller.LoginStatus;

@Service
public class FrontendServiceImpl implements FrontendService {

	@Autowired
	FrontendServiceProxy frontendServiceProxy;

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

	public String isValidToken(HttpServletRequest request) {

		String token = getToken(request);

		TokenStatus tokenStatus = null;

		if (Objects.nonNull(token) && !token.isEmpty()) {

			tokenStatus = frontendServiceProxy.isValidToken(token).getBody();

			return tokenStatus.isStatus() ? tokenStatus.getFirstName() : "";
		}

		return null;
	}

	public void invalidateToken(HttpServletRequest request) {

		String token = getToken(request);

		TokenStatus tokenStatus = null;

		if (Objects.nonNull(token) && !token.isEmpty())

			tokenStatus = frontendServiceProxy.invalidateToken(token).getBody();

	}

}
