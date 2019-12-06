package com.manthan.shoppingapplication.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mantahn.shoppingapp.dao.UserDao;
import com.mantahn.shoppingapp.dao.UserDaoImpl;

import com.manthan.shoppingapp.bean.UserInfoBean;

@WebServlet("/search")
public class SearchProduct extends HttpServlet {

	private UserDao dao=new UserDaoImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
HttpSession session = req.getSession(false);
		
		if(session != null)
		{
			int productId  = Integer.parseInt(req.getParameter("ProductId"));
			UserDao dao =  new UserDaoImpl();
		   UserInfoBean UserInfoBean = dao.SearchProduct(productId);
			
			
			if(UserInfoBean != null) {
				req.setAttribute("searchProduct",UserInfoBean);
			}else
			{
				req.setAttribute("msg", "Product ID not Found");
			}
			req.getRequestDispatcher("./search1").forward(req, resp);
		
		}
		else {
			req.setAttribute("msg", "plese login first");
			req.getRequestDispatcher("./login1").forward(req, resp);
			
		}
	}

}
