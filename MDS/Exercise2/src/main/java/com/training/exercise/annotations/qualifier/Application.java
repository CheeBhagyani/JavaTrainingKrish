package com.training.exercise.annotations.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	private static ApplicationContext context;
	
	public static void main(String[] args) {

		context =  new ClassPathXmlApplicationContext("applicationContextQua.xml");
		Info info = (Info) context.getBean("info");
		info.printName();
		info.printAge();
	}

}
