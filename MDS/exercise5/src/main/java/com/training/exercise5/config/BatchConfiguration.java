package com.training.exercise5.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JpaPagingItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.exercise5.model.Employee;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {
	
	@Autowired
	EntityManagerFactory entityManagerFactory;
	
	@Bean
	public ItemReader<Employee> employeeItemReader() throws Exception {
		JpaPagingItemReader<Employee> reader = new JpaPagingItemReader<Employee>();
		reader.setEntityManagerFactory(entityManagerFactory);
		reader.setQueryString("select e from Employee e");
		reader.setPageSize(1);
		reader.afterPropertiesSet();
		return reader;
	}
	
	@Bean
	public EmpItemProcessor empItemProcessor() {
		System.out.println("processing ...");
		return new EmpItemProcessor();
	}
	
	@Bean EmpItemWriter empItemWriter() {
		return new EmpItemWriter();
	}
	
	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
			ItemReader<Employee> itemReader, ItemProcessor<Employee, Employee> itemProcessor,
			ItemWriter<Employee> itemWriter) {

		Step step = stepBuilderFactory.get("setp1").<Employee, Employee>chunk(100).reader(itemReader)
				.processor(itemProcessor).writer(itemWriter).build();

		return jobBuilderFactory.get("job").incrementer(new RunIdIncrementer())
				.start(step).build();
	}
	
}
