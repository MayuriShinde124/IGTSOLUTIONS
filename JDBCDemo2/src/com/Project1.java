package com;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

import com.mysql.cj.xdevapi.Statement;

	abstract class A
	{
		int id;
		String name;
		int age;
		int salary;
		String designation;
		Scanner sc=new Scanner(System.in);
		
		public A(int salary, String designation) {
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
			
				PreparedStatement  pstmt=con.prepareStatement("insert into employee values(?,?,?,?,?)"); 
				
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter id : ");
				id=sc.nextInt();
				
				System.out.print("Enter Name : ");
				name=sc.next();
				
				System.out.print("Enter age : ");
			    age=sc.nextInt();
			
				
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3,age);
				pstmt.setInt(4,salary);
				pstmt.setString(5, designation);
				
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
	
	
	
	final class Clerk extends A{
		public Clerk() throws ClassNotFoundException{
			
			super(15000,"Clerk");	
		}
			}
	
	
	final class Programmer extends A{
		public Programmer(){
			super(25000,"Programmer");
		}
	}
	
	
	final class Manager extends A{
		public Manager(){
			super(20000,"Manager"); 
		}
	}
	
	
	
class Project1
{
public static void main (String ar[]) throws ClassNotFoundException
{
	int ch1=0,ch2=0;
	do{
		
		System.out.println("--------------------------------");
		System.out.println("1.create");
		System.out.println("2.Read");
		System.out.println("3 update");
		System.out.println("4.delete");
		System.out.println("5.Exit");
		System.out.println("--------------------------------");
		System.out.println("Enter your Choice: ");
		Scanner sc1=new Scanner(System.in);	
		
		ch1=sc1.nextInt();
		if(ch1==1){
			 do{ 
				System.out.println("--------------------------------");
				System.out.println("1.Clerk");
				System.out.println("2.Programer");
				System.out.println("3.Manager");
				System.out.println("4.Exit");
				System.out.println("--------------------------------");
				System.out.println("Enter your Choice: ");
				Scanner sc2=new Scanner(System.in);
				ch2=sc2.nextInt();
				switch(ch2){
						case 1:
						Clerk c=new Clerk();	
						break;
						case 2:
						Programmer p=new Programmer();
						break;
						case 3:
					Manager m=new Manager();	
						break;
					   }
				}while(ch2!=4);
			}
			if(ch1==2){
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
				    
					java.sql.Statement stmt=con.createStatement();
					ResultSet rs=stmt.executeQuery("select * from employee");
					while(rs.next())
					{
						System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4)+":"+rs.getString(5));
						
					}	
				}
				catch(Exception e)
				{
					System.out.println(e);	
				}		
		
				}
			if(ch1==3){
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1","root","root");
				
					PreparedStatement  pstmt=con.prepareStatement("update employee set salary=? where id=? "); 
					
					Scanner sc=new Scanner(System.in);
					System.out.print("Enter id : ");
					int id=sc.nextInt();
			
					
					System.out.print("Enter salary : ");
					int salary=sc.nextInt();
					
				
					pstmt.setInt(1, salary);
					pstmt.setInt(2, id);
				
					pstmt.execute();
					
					pstmt.close();
					System.out.println("data updated successfully.....");	
				}
				catch(Exception e)
				{
					System.out.println(e);	
				}
		 		
				}
			if(ch1==4){
				
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
			
			}while(ch1!=5);
	}
}