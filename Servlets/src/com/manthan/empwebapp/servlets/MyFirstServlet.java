package com.manthan.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

public class MyFirstServlet extends HttpServlet{

  public MyFirstServlet() {
	  System.out.println("constructor");
  }



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


		Date date = new Date();
		resp.setHeader("refresh", "1");

		ServletConfig config = getServletConfig();
		String msg = config.getInitParameter("message");

		ServletContext context = getServletContext();
		String code = context.getInitParameter("CountryCode");

		PrintWriter out = resp.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Current System Date & time-<br>" + date + "</h1>");
		out.print(msg);
		out.print( "<br> CountryCode =" + code);
		out.print("</body>");
		out.print("</html>");




	}

}//end of class
