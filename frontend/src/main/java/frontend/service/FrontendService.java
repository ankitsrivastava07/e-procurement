package frontend.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import frontend.controller.LoginStatus;

public interface FrontendService {

	void setCookie(HttpServletRequest request, HttpServletResponse response, LoginStatus token);

	String isTokenExist(HttpServletRequest request);
}
