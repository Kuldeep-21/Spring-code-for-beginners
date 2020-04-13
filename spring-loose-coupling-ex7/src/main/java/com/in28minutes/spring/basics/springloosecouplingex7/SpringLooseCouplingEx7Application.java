package com.in28minutes.spring.basics.springloosecouplingex7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in28minutes.spring.basics.springloosecouplingex7.BinarySearchImpl;

@SpringBootApplication
public class SpringLooseCouplingEx7Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLooseCouplingEx7Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		//prototype class example both reference point to different  object 
		
		int result = binarySearch.binarySearch(new int[] {1,2,3,4,5},3);
		
		System.out.println(result);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
	
	}

}
