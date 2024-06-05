package com.spring.standlonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/standlonecollection/config.xml");
		Person person = context.getBean(Person.class);
		System.out.println(person);
	}

}
