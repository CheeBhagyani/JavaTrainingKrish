package com.training.exercise4.eventListeners;

import org.springframework.batch.core.SkipListener;

public class StepSkipListener implements SkipListener<String, Number>{

	@Override
	public void onSkipInRead(Throwable t) {
		System.out.println("Skip listener - onSkipInRead");
		
	}

	@Override
	public void onSkipInWrite(Number item, Throwable t) {
		System.out.println("Skip listener - onSkipInWrite");
		
	}

	@Override
	public void onSkipInProcess(String item, Throwable t) {
		System.out.println("Skip listener - onSkipInProcess");
		
	}

}
