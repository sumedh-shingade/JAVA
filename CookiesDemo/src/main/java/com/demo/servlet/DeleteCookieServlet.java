package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/delcookie")
public class DeleteCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nm=request.getParameter("name");
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		Cookie[] carr=request.getCookies();
		
		for(Cookie c:carr) {
			if(c.getName().equals(nm)) {
			//delete the cookie,change the maxage to 0 and send it to client
			//to delete it 
			c.setMaxAge(0);
			response.addCookie(c);
		}
		}
		
		out.println("deleted");
		RequestDispatcher rd=request.getRequestDispatcher("cookiedata.html");
		rd.include(request, response);
		
		
		
		
	}

	
}
