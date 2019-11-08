package com.training.exercise4.eventListeners;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobResultListener implements JobExecutionListener{

	@Override
	public void beforeJob(JobExecution jobExecution) {
		System.out.println("JobExecutionListener - before job");
		
	}

	@Override
	public void afterJob(JobExecution jobExecution) {
		System.out.println("JobExecutionListener - after job");
		
	}

}
