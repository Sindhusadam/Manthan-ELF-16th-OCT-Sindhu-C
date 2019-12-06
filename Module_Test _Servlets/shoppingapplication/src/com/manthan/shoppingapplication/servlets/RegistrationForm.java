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


@WebServlet("/register")
public class RegistrationForm extends HttpServlet {

	private UserDao dao=new UserDaoImpl();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession(false);

		if(session != null) {
			int userID=Integer.parseInt(req.getParameter("UserID"));
			String username=req.getParameter("UserName");
			String email=req.getParameter("Email");
			String password=req.getParameter("Password");


			UserInfoBean userInfoBean=new UserInfoBean();

			userInfoBean.setUserID(userID);
			userInfoBean.setUserName(username);
			userInfoBean.setEmail(email);
			userInfoBean.setPassword(password);



			if(dao.registerUser(userInfoBean)) {
				req.setAttribute("registeredMsg", "Registration successfull!....");
				req.getRequestDispatcher("./login1").forward(req, resp);
			}else {
				req.setAttribute("registeredMsg", "User already exist!...");
				req.getRequestDispatcher("./register1").forward(req, resp);
			}
		}

	}
}
