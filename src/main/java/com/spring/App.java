package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.Address;
import com.spring.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/config.xml");
        Employee emp =context.getBean("emp1",Employee.class);
        System.out.println(emp);
        
        
        	 	
    }
}
