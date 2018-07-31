package com.arquiteto.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OlaMundo
 */
public class OlaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OlaMundo() {
        super();
        System.out.println("sdfsfsdfsd");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		com.arquiteto.business.OlaMundo ola = new com.arquiteto.business.OlaMundo();
		
		String yourName = request.getParameter("the_name");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + ola.olaMundo(yourName) + "</h1>");
		writer.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		com.arquiteto.business.OlaMundo ola = new com.arquiteto.business.OlaMundo();
		
		String yourName = request.getParameter("the_name");
		PrintWriter writer = response.getWriter();
		writer.println("<h1>Hello " + ola.olaMundo(yourName) + "</h1>");
		writer.close();
	}

}
