package com;
import java.sql.*;
public class Demo1 {

	public static void main(String[] args) {
		//java to Database::
		 //5 Steps
		//step 1 load the driver + add the jar file 
		//Step 2  create the connection 
		// step 3 create the Statement 
		//step 4 is execute the statement 
		// step 5 is close the connection
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
			Statement stmt=con.createStatement();
			stmt.execute("insert into emp values (119,'megha')");
			stmt.close();
			System.out.println("data inserted successfully.....");	
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
		
		

	}

}
