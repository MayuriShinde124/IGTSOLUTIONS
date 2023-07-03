package com;

 

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

 

public class App {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Transaction tx = session.beginTransaction();

        EmployeeIGT e = new EmployeeIGT();
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter id:");
      
       int  uid= sc.nextInt();
        System.out.print("Enter Name :");
      String   name= sc.next();
        System.out.print("Enter Age: ");
      int   age= sc.nextInt();
        System.out.print("Enter salary: ");
       int  salary= sc.nextInt(); 
       System.out.print("Enter designation :");
       String  desig= sc.next();

        e.setUid(uid);
        e.setName(name);
        e.setDesig(desig);
        e.setAge(age);
        e.setSalary(salary);

        session.save(e);
        tx.commit();

        System.out.println("Inserted");
    }

 

}