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

public class DeleteRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("uid"));
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
			
			PreparedStatement  pstmt=con.prepareStatement("delete from employee1 where id=?"); 
		
			pstmt.setInt(1, id);
			pstmt.execute();
	
		    System.out.println("Data Deleted sucessfully...!");
		
			pstmt.close();
		

	        PrintWriter out=response.getWriter();

	        out.print("<h1>");
	        out.print("Id : "+id);
	        out.print("<br>");
	 
	 
	    
	        out.print("</h1>");
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		PrintWriter out=response.getWriter();
		out.print("<h3>Data Deleted Sucessfully...!<h3>");
		out.print("<br>");
		out.print("<h3>");
		out.print(" <a href='Index.html'>Index</a>");
		out.print("</h3>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
