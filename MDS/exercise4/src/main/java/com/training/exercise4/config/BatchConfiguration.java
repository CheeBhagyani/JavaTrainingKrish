package com.training.exercise4.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JdbcCursorItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.exercise4.eventListeners.JobResultListener;
import com.training.exercise4.eventListeners.StepItemChunkListener;
import com.training.exercise4.eventListeners.StepItemProcessListener;
import com.training.exercise4.eventListeners.StepItemReadListener;
import com.training.exercise4.eventListeners.StepItemWriteListener;
import com.training.exercise4.eventListeners.StepResultListener;
import com.training.exercise4.eventListeners.StepSkipListener;
import com.training.exercise4.model.Employee;

@Configuration
@EnableBatchProcessing
public class BatchConfiguration {

	@Autowired
	public JobBuilderFactory builderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public EntityManagerFactory entityManagerFactory;
	
	@Bean
	ItemReader<Employee> getItemReader(DataSource dataSource) throws Exception {
		JdbcCursorItemReader<Employee> databaseReader = new JdbcCursorItemReader<>();
		System.out.println(databaseReader);
		databaseReader.setSql("SELECT * FROM employee;");
		databaseReader.setDataSource(dataSource);
		databaseReader.setRowMapper(new CustomRowMapper());
		System.out.println("reading ...");
		return databaseReader;
	}


	@Bean
	public EmpItemProcessor empItemProcessor() {
		System.out.println("processing ...");
		return new EmpItemProcessor();
	}

//	@Bean
//	public JdbcBatchItemWriter<Employee> batchItemWriter(DataSource dataSource) {
//		JdbcBatchItemWriter<Employee> itemWriter = new JdbcBatchItemWriter<>();
//
//		itemWriter.setDataSource(dataSource);
//		itemWriter.setSql("INSERT INTO employee VALUES (:empid, :address, :dob, :joindate, :name, :role, :salary)");
//		itemWriter.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<Employee>());
//		itemWriter.afterPropertiesSet();
//		System.out.println(itemWriter);
//		return itemWriter;
//	}

	@Bean
	public Job job(JobBuilderFactory jobBuilderFactory, StepBuilderFactory stepBuilderFactory,
			ItemReader<Employee> itemReader, ItemProcessor<Employee, Employee> itemProcessor,
			ItemWriter<Employee> itemWriter) {

		Step step = stepBuilderFactory.get("setp1").<Employee, Employee>chunk(100).reader(itemReader)
				.processor(itemProcessor).writer(itemWriter).listener(new StepResultListener())
				.listener(new StepItemReadListener()).listener(new StepItemProcessListener())
				.listener(new StepItemWriteListener()).listener(new StepItemChunkListener())
				.listener(new StepSkipListener()).build();

		return jobBuilderFactory.get("job").incrementer(new RunIdIncrementer()).listener(new JobResultListener())
				.start(step).build();
	}
}
