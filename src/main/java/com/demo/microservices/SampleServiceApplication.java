package com.demo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleServiceApplication.class, args);
		System.out.println("스프링 잘 기동되나요????");
	}

}
