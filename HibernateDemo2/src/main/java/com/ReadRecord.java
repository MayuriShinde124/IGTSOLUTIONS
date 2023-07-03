package com;

import java.util.Iterator;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;

public class ReadRecord {
	 public static void main(String[] args) {

	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");

	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();

	        Transaction tx = session.beginTransaction();
	        
	        
	        EmployeeIGT e=session.load(EmployeeIGT.class, 100);
	        System.out.println("=============");
	        System.out.println("UID :"+e.getUid());
	        System.out.println("U Name :"+e.getName());
	       
            System.out.println("Age is :"+e.getAge());
            System.out.println("Designation"+e.getDesig());
            System.out.println("Salary "+e.getSalary());
          
	        
            
	        
	        
	       /* java.util.List emp=session.createQuery("from  EmployeeIGT").list();
	        Iterator i=emp.iterator();
	        while(i.hasNext()) {
	        	EmployeeIGT e=(EmployeeIGT)i.next();
	            System.out.println(e.getUid());
	            System.out.println(e.getAge());
	            System.out.println(e.getDesig());
	            System.out.println(e.getSalary());
	            System.out.println(e.getName());
	        }
	        */
            System.out.println("data");
	       
	      
	        

	 
	    }

	 

	}


