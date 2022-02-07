package com.wu.onep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.wu.onep.model.Employee;

@SpringBootApplication
@EnableJpaRepositories("com.wu.onep.database")
@EntityScan(basePackageClasses = Employee.class)
@ComponentScan(basePackages = { "com.wu.onep" })
public class HikariDemoApplication {

	/**
	 * A main method to start this application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(HikariDemoApplication.class, args);
	}
}