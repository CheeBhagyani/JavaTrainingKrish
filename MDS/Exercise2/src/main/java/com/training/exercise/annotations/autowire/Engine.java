package com.training.exercise.annotations.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Engine {

	private Break b;

	@Autowired
	public void setB(Break b) {
		this.b = b;
	}
	
	public Break getB() {
		return b;
	}
	
	public void checkBreak() {
		b.checkBreak();
	}
}
