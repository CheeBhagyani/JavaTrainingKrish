package com.training.exercise4.eventListeners;

import org.springframework.batch.core.ItemProcessListener;

public class StepItemProcessListener implements ItemProcessListener<String, Number>	{

	@Override
	public void beforeProcess(String item) {
		System.out.println("ItemProcessListener - before process");
		
	}

	@Override
	public void afterProcess(String item, Number result) {
		System.out.println("ItemProcessListener - after process");
		
	}

	@Override
	public void onProcessError(String item, Exception e) {
		System.out.println("ItemProcessListener - on process errors");	
		
	}

}
