package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;

public class InsertRecord {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
		//	Statement stmt=con.createStatement();
			//stmt.execute("insert into employee values (666,'shital',23,65000,'Manager')");
			PreparedStatement  pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?)"); 
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter id : ");
			int id=sc.nextInt();
			
			System.out.print("Enter Name : ");
			String name=sc.next();
			
			System.out.print("Enter age : ");
			int age=sc.nextInt();
			
			System.out.print("Enter salary : ");
			int salary=sc.nextInt();
			
			System.out.print("Enter Designation : ");
			String desig=sc.next();
			
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3,age);
			pstmt.setInt(4, salary);
			pstmt.setString(5, desig);
			pstmt.execute();
			
			pstmt.close();
			System.out.println("data inserted successfully.....");	
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
		
		

	}

}
