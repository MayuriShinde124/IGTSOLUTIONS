package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		System.out.println("======Setter injuction=======");
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e=(Employee)context.getBean("emp");
		e.display();
		System.out.println(e);
		
		Resource re=new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(re);
		Employee e1=(Employee)factory.getBean("emp");
		e1.display();
		System.out.println("======Constructor injuction=======");
		Product pro=(Product)factory.getBean("prod");
	    pro.display();
		
		
	}

}
