package com;
import java.sql.*;
public class Demo1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
			Statement stmt=con.createStatement();
			stmt.execute("insert into employee values (666,'shital',23,65000,'Manager')");
			stmt.close();
			System.out.println("data inserted successfully.....");	
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
		
		

	}

}
