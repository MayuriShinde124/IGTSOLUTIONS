package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {
	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
			
			PreparedStatement  pstmt=con.prepareStatement("delete from employee where id=?"); 
			
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter id : ");
			int id=sc.nextInt();

		
			pstmt.setInt(1, id);
		
			pstmt.execute();
			
			pstmt.close();
			System.out.println("data deleted successfully.....");	
		}
		catch(Exception e)
		{
			System.out.println(e);	
		}
		

}

}
