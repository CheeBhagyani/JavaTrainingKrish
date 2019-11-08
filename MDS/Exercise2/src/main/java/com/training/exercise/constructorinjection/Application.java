package com.training.exercise.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContextCon.xml");
		Employee emp = (Employee)context.getBean("emp");
		String deptName = "IT";
		emp.printDeptName(deptName);
	}

}
