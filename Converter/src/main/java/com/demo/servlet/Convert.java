package com.demo.servlet;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Convert extends HttpServlet {
	
	

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String dollar=request.getParameter("dollar");
		String Inr=request.getParameter("inr");
		out.println("<form action='convert' method='get'>");
		out.println("<table border='2'><tr><td>Dollar</td><td>INR</td></tr>");
		
			
		if(dollar.equals("")) {
			double d=(Double.parseDouble(Inr)/82);
			
			out.println("<tr><td><input type='text' name='dollar' id='doll' value='"+d+"'</input></td>");
			out.println("<td><input type='text' name='inr' id='inr' value='"+Inr+"'></td></tr>");
		
		}else			
		{
		double d=Double.parseDouble(dollar)*82;
			out.println("<tr><td><input type='text' name='dollar' id='Inr' value='"+dollar+"'</input></td>");
			out.println("<td><input type='text' name='inr' id='' value='"+d+"'></td></tr>");
		}
		out.println("<tr><td colspan='2'><button type='submit' name='btn' id='btn'>Convert</button><td></tr>");
		out.println("</table></form>");
		
			
	}
	
}
