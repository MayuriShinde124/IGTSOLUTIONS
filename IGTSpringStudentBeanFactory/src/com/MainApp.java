package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args)
	{  
		
		Resource r=new ClassPathResource("applicationContext.xml");
		
		BeanFactory factory=new XmlBeanFactory(r);
		
		
		Student e=(Student)factory.getBean("stu");
		e.display();
	}

}
