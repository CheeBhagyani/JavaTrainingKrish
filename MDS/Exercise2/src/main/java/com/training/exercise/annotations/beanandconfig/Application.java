package com.training.exercise.annotations.beanandconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = 
		         new AnnotationConfigApplicationContext(Greeting.class);
		   
		      Greeting greeting = ctx.getBean(Greeting.class);
		      greeting.setMessage("Hello World!");
		      System.out.println(greeting.getMessage());
	}

}
