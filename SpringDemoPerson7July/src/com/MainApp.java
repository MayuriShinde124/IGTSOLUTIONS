package com;

import java.util.*;
import java.util.Iterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String ar[])
	{
		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      Person p = (Person)context.getBean("per");
	        
	      System.out.println(p.getPid()+": "+p.getName());
	      System.out.println("+++++++++++++++++++++++++++++Array+++++++++++++++++++++ ");
	    	
	       String[] hb=p.getHobbies();
	    	for(String s:hb)
	    	{
	    		System.out.println("    "+s);
	    	}
	    	
	    	
	    	ArrayList <String> em=p.getEmails();
	    	 System.out.println("++++++++++++++++++++++++++ArrayList ::::+++++++++++++++++++++++++");
	    	 for(String s:em)
		    	{
		    		System.out.println("    "+s);
		    	}
	    	 
	    	 
	    	 HashSet <String> ph=p.getPhones();
	    	 System.out.println("*****************************HashSet************************************");
	    	 for(String s:ph)
		    	{
		    		System.out.println("     "+s);
		    	}
	    	 
	    	 
	    	 HashMap <String,String> ed=p.getEducation();
	    	 System.out.println("---------------------------------HashMap----------------------------------");
	    	Iterator it=ed.entrySet().iterator();
	    	while(it.hasNext())
	    	{
	    		System.out.println("      "+it.next());
	    	}
	    	
	}
}
