package com.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beanContext.xml");
		
		Student student = (Student)context.getBean("s1");
		System.out.println("Student:"+student);
	}

}
