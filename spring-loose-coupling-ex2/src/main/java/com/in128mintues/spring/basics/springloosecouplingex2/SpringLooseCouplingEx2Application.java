package com.in128mintues.spring.basics.springloosecouplingex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLooseCouplingEx2Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLooseCouplingEx2Application.class, args);
		
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {1,2,3,4,5},3);
		
		System.out.println(result);

		
		
	}

}
