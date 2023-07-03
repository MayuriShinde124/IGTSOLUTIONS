package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadRecord
 */
public class ReadRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
		    PrintWriter out=response.getWriter();
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee1");
			out.print("<h4>");
			while(rs.next())
			{
				out.print(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5));
				out.print("<br>");
			}
			
			out.print("<br>");
			out.print("<h3>");
			out.print(" <a href='Index.html'>Index</a>");
			out.print("</h3>");
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}	

	}

	
}
