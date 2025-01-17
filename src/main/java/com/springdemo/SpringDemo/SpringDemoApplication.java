package com.springdemo.SpringDemo;

import com.springdemo.SpringDemo.model.Laptop;
import com.springdemo.SpringDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(SpringDemoApplication.class, args);

		Laptop laptop = context.getBean(Laptop.class);
		LaptopService service = context.getBean(LaptopService.class);

		service.addLaptop(laptop);
		laptop.compile();
	}
}
