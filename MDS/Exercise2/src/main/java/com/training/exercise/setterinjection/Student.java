package com.training.exercise.setterinjection;

public class Student {

	private Course course;

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	public void printCourseName(String courseName) {
		getCourse().printCourseName(courseName);
	}
	
}
