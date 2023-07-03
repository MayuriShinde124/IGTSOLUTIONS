package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Deposit
 */
@WebServlet("/Deposit")
public class Deposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int acc=Integer.parseInt(request.getParameter("uacc"));
		
	String pan=request.getParameter("upan");
	int phn=Integer.parseInt(request.getParameter("uphn"));
	
		int amount=Integer.parseInt(request.getParameter("uamount"));
		int balance=Integer.parseInt(request.getParameter("ubalance"));
	    int currentbalace=amount+balance;
		
		try {		
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "root");
	
			PreparedStatement pstmt=con.prepareStatement("update bank set balance=? where accno=? or pan=? or phn=?");
			System.out.println("Data Updated sucessfully...!");
		
				pstmt.setInt(1, currentbalace);
				pstmt.setInt(2, acc);
				pstmt.setString(3, pan);
				pstmt.setInt(4, phn);
		
				pstmt.execute();
				
				System.out.println("Data Updated sucessfully...!");
		
			pstmt.close();
			

	        PrintWriter out=response.getWriter();
	      	out.print("<h4>");
	           out.print("<a href='Home.html'>HOME PAGE</a>");
	            out.print("</h4>");
	    
		} 
		catch (Exception e) {
			System.out.println(e);
		}
		
		PrintWriter out=response.getWriter();
		out.print("<h3>");
		out.print("Data updated Sucessfully...!");
	
		out.print("</h3>");
		out.print(" <a href='Home.html'>Index</a>");
		out.print("</h3>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
