package com.training.exercise.annotations.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	private static ApplicationContext context;
	
	public static void main(String args[]) {
		context = new ClassPathXmlApplicationContext("applicationContextAutowire.xml");
		
		Engine engine = (Engine) context.getBean("eng");
		engine.checkBreak();	
	}
}
