package com.training.exercise.setterinjection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("applicationContextSet.xml");
		Student student = (Student) context.getBean("student");
		String courseName = "Computer Science";
		student.printCourseName(courseName);
	}

}
