package com.saral.training.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet(description = "my first servlet", urlPatterns = { "/FirstServletPath" },
	initParams={@WebInitParam(name = "defaultUser", value = "Saral saxena")}
		)
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("welcome to the(just check) first get servlet");

		PrintWriter writter = response.getWriter();
		writter.println("<h3>hello in html(check)</h3>"+"init param is :"+this.getServletConfig().getInitParameter("defaultUser"));
		System.out.println("init param is :"+this.getServletConfig().getInitParameter("defaultUser"));
		
		
	}

}
