package com.nama.springboot.firstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nama.springboot.firstdemo.model.Book;





//@SpringBootApplication = @Configuration + @ComponentScan + @AutoConfiguration
@SpringBootApplication
public class FirstdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstdemoApplication.class, args);
		
		
		Book b = (Book)context.getBean("book");
		System.out.println(b.getBookId()+" , "+b.getBookName()+" , "+b.getAuthorName());
		
		/*
        HelloWorldBean hw = (HelloWorldBean)context.getBean("hello");
		System.out.println(hw.getMessage());
		*/
		
		
		
		
	}

}
