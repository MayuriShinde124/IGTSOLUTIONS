package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

 

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name=request.getParameter("uname");
		String lname=request.getParameter("lname");
		PrintWriter out=response.getWriter();
		String fullname=name+" "+lname;
		out.print("<h1>");
		out.print("My Full Name is : "+fullname);
		out.print("</h1>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
