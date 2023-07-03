package com;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {

            ServletConfig config=getServletConfig();
             String driver=config.getInitParameter("driver");
             String url=config.getInitParameter("url");
             String username=config.getInitParameter("username");
             String password=config.getInitParameter("password");

            Class.forName(driver);
            Connection con= DriverManager.getConnection(url,username,password);
            Statement stmt=con.createStatement();
            stmt.execute("insert into employee values(200,'mishti',35,60000,'Developer')");
            stmt.close();
            System.out.println("data inserted sucessfully...!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
