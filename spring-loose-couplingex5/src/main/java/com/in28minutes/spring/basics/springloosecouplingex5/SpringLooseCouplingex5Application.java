package com.in28minutes.spring.basics.springloosecouplingex5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringLooseCouplingex5Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLooseCouplingex5Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		 int result = binarySearch.binarySearch(new int[] {1,2,3,4,5},3);
			
			System.out.println(result);
	}

}
