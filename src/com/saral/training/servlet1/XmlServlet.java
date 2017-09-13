package com.saral.training.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class XmlServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to the first get servlet of xml based configuration");
		
		String username = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(username!=null){
			context.setAttribute("username", username);
			session.setAttribute("username", username);	
		}
		
		response.setContentType("text/html");
		PrintWriter writter = response.getWriter();
		writter.println("<h3>hello "+username+"</h3>"+" session value is "+session.getAttribute("username")+" context value is "
				+ context.getAttribute("username")+"init paraeter wiht xml is "+
				this.getServletConfig().getInitParameter("defaultkaam"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to the first get servlet of xml based configuration");
		
		String username = request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		if(username!=null){
			context.setAttribute("username", username);
			session.setAttribute("username", username);	
		}
		
		response.setContentType("text/html");
		PrintWriter writter = response.getWriter();
		writter.println("<h3>hello "+username+"</h3>"+" session value is "+session.getAttribute("username")+" context value is "
				+ context.getAttribute("username"));
	}

}
