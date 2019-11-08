package com.training.exercise.annotations.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Info {
	
	@Autowired
	@Qualifier("user1")
	private User user;

	public Info() {
		System.out.println("Info Constructor");
	}
	
	public void printName() {
		System.out.println("Name: " + user.getName());
	}
	
	public void printAge() {
		System.out.println("Age: " + user.getAge());
	}
}
