package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String ar[])
	{
		  ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	        Question e = (Question)context.getBean("answers");
	        e.display();
	}
}
