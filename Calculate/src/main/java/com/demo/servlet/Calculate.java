package com.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculate extends HttpServlet {

	public int  factorial(int num){
		
		int fact=1;
		while(num!=1) {
			fact=fact*num;
			num--;
		}
		return fact;
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException
	{
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		int num1=Integer.parseInt(req.getParameter("num1"));
		
		String btn=req.getParameter("button");
		
		switch(btn)
		{
		case "add":
			int num2=Integer.parseInt(req.getParameter("num2"));
			out.println("<h1> Add= "+(num1+num2)+"</h1>");
			break;
		case "fact":
			int f=factorial(num1);
			out.println("<h2> Factorial= "+f+"</h2>");
			break;
		}
	}
	
	
}
