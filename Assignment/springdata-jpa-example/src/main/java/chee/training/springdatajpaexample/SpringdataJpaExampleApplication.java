package chee.training.springdatajpaexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EntityScan(basePackages = "chee.rentcloud.commons.model")
public class SpringdataJpaExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdataJpaExampleApplication.class, args);
	}

}
