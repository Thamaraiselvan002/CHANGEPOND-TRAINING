package org.studyeasy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.studyeasy.entity.User;

import org.studyeasy.model.UserModel;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import org.studyeasy.model.UserModel;





@WebServlet("/home")
public class Home extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String page = request.getParameter("page").toLowerCase();
        
        // Check if the "page" parameter is present
       
            switch (page) {
                case "home": {
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                    break;
                }
                case "listusers": {
                    UserModel userModel = new UserModel();
                    List<User> userList = userModel.listusers();

                    // Set the list in the request attribute for the JSP
                    request.setAttribute("listusers", userList);

                    // Forward to your JSP page
                    request.getRequestDispatcher("listusers.jsp").forward(request, response);;
                   
                    break;
                }
                case "adduser": {
        			request.getRequestDispatcher("adduser.jsp").forward(request, response);
        		}
                case "updateuser": {
        			request.getRequestDispatcher("updateuser.jsp").forward(request, response);
        			break;
        		}
        		case "deleteuser": {
        			int userid = Integer.parseInt(request.getParameter("user_id"));
        			new UserModel().deleteUser(userid);
        			List<User> users = new ArrayList<>();
        			users = new UserModel().listusers();
        			request.setAttribute("listusers", users);
        			request.getRequestDispatcher("listusers.jsp").forward(request, response);
        			break;
        		}
                default: {
                    // Handle unknown page parameter value
                    response.sendError(HttpServletResponse.SC_NOT_FOUND, "Page not found");
                    break;
                }
            }
       
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String form = request.getParameter("form").toLowerCase();
		switch (form) {
		case "adduseroperation": {
			//System.out.println(form);
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			User user = new User(username, email);
			request.setAttribute("users", user);
			new UserModel().addUser(user);
			List<User> users = new ArrayList<>();
			users = new UserModel().listusers();
			request.setAttribute("listusers", users);
			request.getRequestDispatcher("listusers.jsp").forward(request, response);
			break;
		}
		
		case "updateuseroperation": {
			//System.out.println(form);
			
			//logger.info("Update");
			int user_id=Integer.parseInt(request.getParameter("userid"));
			String username = request.getParameter("username");
			String email = request.getParameter("email");
			//logger.info(user_id);
			//logger.info(username);
			//logger.info(email);
			User updateuser = new User(user_id,username, email);
			new UserModel().updateUser(updateuser);
			List<User> users = new ArrayList<>();
			users = new UserModel().listusers();
			request.setAttribute("listusers", users);
		request.getRequestDispatcher("listusers.jsp").forward(request, response);
		break;
		}
		
	
		}
		}
	}

