package com;

import java.sql.Connection;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

public class ReadRecord {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
		    
			java.sql.Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getInt(3)+"  "+rs.getInt(4)+"   "+rs.getString(5));
				
			}
			
			
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
		

	}}
