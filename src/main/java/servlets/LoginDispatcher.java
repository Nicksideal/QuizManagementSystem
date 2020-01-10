package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import daos.UserDao;
import daos.UserDaoImpl;
import models.LoginForm;
import models.User;
import utility.Exceptions;
import utility.JsonReader;

public class LoginDispatcher implements Dispatcher {
	private User loggedInUser = null;
	private UserDao userDao = UserDaoImpl.getInstance();

	@Override
	public boolean isSupported(HttpServletRequest request) {
		return isLoginRequest(request);
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			LoginForm credentials = (LoginForm) JsonReader.read(request.getInputStream(), LoginForm.class);
			loggedInUser = userDao.login(credentials.getUsername(), credentials.getPassword());
			
			if (loggedInUser == null) {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED); // Unauthorized status code
				return;
			} else {
				response.setStatus(HttpServletResponse.SC_OK);
				request.getSession().setAttribute("user", loggedInUser);
				response.getOutputStream().write(JsonReader.write(loggedInUser));
				return;
			}
		} catch (IOException e) {
			Exceptions.logJsonUnmarshalException(e, LoginForm.class);
		}

	}

	
	private boolean isLoginRequest(HttpServletRequest req) {
		return req.getMethod().equals("POST") && req.getRequestURI().equals("/QMSApplication/login");
	}

}
