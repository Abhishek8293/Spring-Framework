package com.spring.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stereotype/config.xml");
		PersonEntity person = context.getBean(PersonEntity.class);
		System.out.println(person);
	}

}
