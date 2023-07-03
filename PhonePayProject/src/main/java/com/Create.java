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
 * Servlet implementation class Create
 */
@WebServlet("/Create")
public class Create extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Create() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("uid"));
		String name=request.getParameter("uname");
		int acc=Integer.parseInt(request.getParameter("uacc"));
		String ifsc=request.getParameter("uifsc");
		String pan=request.getParameter("upan");
		int phn=Integer.parseInt(request.getParameter("uphn"));
		int adhar=Integer.parseInt(request.getParameter("uadhar"));
		int balance=Integer.parseInt(request.getParameter("ubalance"));
	
		try {		
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root", "root");
	
			PreparedStatement pstmt=con.prepareStatement("insert into bank values(?,?,?,?,?,?,?,?)");
			System.out.println("data inserted sucessfully...!");
	
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, acc);
				pstmt.setString(4, ifsc);
				pstmt.setString(5, pan);
				pstmt.setInt(6, phn);
				pstmt.setInt(7, adhar);
				pstmt.setInt(8, balance);
				pstmt.execute();
				
				System.out.println("data inserted sucessfully...!");

				PrintWriter out=response.getWriter();
				out.print("<h3>ACCOUNT CREATED...!<h3>");
				out.print("<br>");
				out.print("<h3>");
				out.print(" <a href='Home.html'>Index</a>");
				out.print("</h3>");
		
			pstmt.close();
	
		} 
		catch (Exception e) {
			System.out.println(e);
		}
	
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
