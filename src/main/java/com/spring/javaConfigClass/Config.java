package com.spring.javaConfigClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean(name = "student1")
	public Student student() {
		Address address = new Address(1,"Raipur");
		Student student = new Student(101,"John Doe",address);
		return student;
	}

}
