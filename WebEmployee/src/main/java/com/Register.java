package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("uid"));
		String name=request.getParameter("uname");
		int age=Integer.parseInt(request.getParameter("uage"));
		int salary=Integer.parseInt(request.getParameter("usalary"));
		String designation=request.getParameter("udesignation");
		
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "root");
	
			PreparedStatement pstmt=con.prepareStatement("insert into employee1 values(?,?,?,?,?)");
			
	
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, age);
				pstmt.setInt(4, salary);
				pstmt.setString(5, designation);
				pstmt.execute();
				
				System.out.println("data inserted sucessfully...!");
		
			pstmt.close();
			

	        PrintWriter out=response.getWriter();

	        out.print("<h1>");
	        out.print("Id : "+id);
	        out.print("<br>");
	        out.print("Name : "+name);
	        out.print("<br>");
	        out.print("AGE : "+age);
	        out.print("<br>");
	        out.print("Salary : "+salary);
	        out.print("<br>");
	        out.print("designation : "+designation);
	        out.print("</h1>");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		PrintWriter out=response.getWriter();
		out.print("<h3>Data Inserted Sucessfully...!<h3>");
		out.print("<br>");
		out.print("<h3>");
		out.print(" <a href='Index.html'>Index</a>");
		out.print("</h3>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
