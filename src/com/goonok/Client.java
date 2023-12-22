package com.goonok;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("Beans.xml file is working fine");
		College college =  context.getBean("college", College.class);
		System.out.println("The college object is created by Spring is: " + college);
		college.test();
		context.close();
	}

}
