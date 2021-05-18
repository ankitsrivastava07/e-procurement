package frontend.service;

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

			for (Cookie cookie : cookies) {

				if (cookie.getName() == "session_Token") {
					cookie.setValue(status.getToken());
					return;
				}
			}

		status.setStatus(Boolean.FALSE);
		status.setMessage(null);

		Cookie cookie = new Cookie("session_Token", status.getToken());
		response.addCookie(cookie);
	}

	@Override
	public String isTokenExist(HttpServletRequest request) {

		Cookie cookies[] = request.getCookies();

		String userName = "";

		if (cookies != null)

			for (Cookie cookie : cookies) {

				if (cookie.getName().equalsIgnoreCase("session_Token")) {
					userName = isValidToken(cookie.getValue());
				}
			}

		return userName;
	}

	public String isValidToken(String token) {

		TokenStatus tokenStatus = frontendServiceProxy.getUsernameFromToken(token).getBody();

		return tokenStatus.isStatus() ? tokenStatus.getFirstName() : "";
	}

}
