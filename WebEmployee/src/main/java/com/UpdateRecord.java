package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("uid"));

		int salary=Integer.parseInt(request.getParameter("usalary"));
	
		
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "root");
	
			PreparedStatement pstmt=con.prepareStatement("update employee1 set salary=? where id=?");
		
		
				pstmt.setInt(1, salary);
				pstmt.setInt(2, id);
		
				pstmt.execute();
				
				System.out.println("Data Updated sucessfully...!");
		
			pstmt.close();
			

	        PrintWriter out=response.getWriter();

	        out.print("<h1>");
	        out.print("Id : "+id);
	        out.print("<br>");
	 
	        out.print("Salary : "+salary);
	    
	        out.print("</h1>");
	    	out.print("<br>");
			out.print("<h3>");
			out.print(" <a href='Index.html'>");
			out.print("</h3>");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		PrintWriter out=response.getWriter();
		out.print("<h3>Data updated Sucessfully...!<h3>");
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
