package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.xdevapi.Statement;

/**
 * Servlet implementation class CheckBalance
 */
@WebServlet("/CheckBalance")
public class CheckBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
		    PrintWriter out=response.getWriter();
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from bank");
			out.print("<h4>");

	            out.print("<h4>");
	           while(rs.next()) {
	               out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
	               out.print("<br>");
	           } 
	       	out.print("<h4>");
	           out.print("<a href='Home.html'>HOME PAGE</a>");
	            out.print("</h4>");
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);    
	        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
