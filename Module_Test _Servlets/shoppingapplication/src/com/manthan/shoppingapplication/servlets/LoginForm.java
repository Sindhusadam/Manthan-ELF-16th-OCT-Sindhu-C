package com.manthan.shoppingapplication.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mantahn.shoppingapp.dao.UserDao;
import com.mantahn.shoppingapp.dao.UserDaoImpl;
import com.manthan.shoppingapp.bean.UserInfoBean;

@WebServlet("/login")
public class LoginForm extends HttpServlet{

	UserDao dao =new UserDaoImpl();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String email=(req.getParameter("email"));
		String password=(req.getParameter("password"));

		UserInfoBean userinfobean = dao.authentication(email, password);

		if (userinfobean==null) {
			HttpSession session = req.getSession(true);
			session.setAttribute("userInfoBean", userinfobean);
			req.getRequestDispatcher("").forward(req, resp);

		} else {

			req.setAttribute("msg", "Invalid credentials");
			req.getRequestDispatcher("").forward(req, resp);
		}


	}


}
