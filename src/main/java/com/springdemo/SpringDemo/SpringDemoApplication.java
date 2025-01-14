package com.springdemo.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringDemoApplication.class, args);

		Person object = context.getBean(Person.class);

		System.out.println("Hello Spring");
		object.info();
	}
}
