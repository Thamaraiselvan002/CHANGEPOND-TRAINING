package org.studyeasy;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
/**
 * Servlet implementation class SiteController
 */
public class SiteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("thams") && password.equals("1234")) {
			request.getSession().invalidate();
			HttpSession newSession=request.getSession();
			newSession.setMaxInactiveInterval(500);
			Cookie cookie=new Cookie("username",username);
			response.addCookie(cookie);
			response.sendRedirect("member.jsp");
		}
		else {
			response.sendRedirect("pnf.jsp");
		}

	}

}
