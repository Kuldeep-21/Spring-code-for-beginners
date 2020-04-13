package com.in128mintues.spring.basics.springloosecouplingex4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in128mintues.spring.basics.springloosecouplingex4.BinarySearchImpl;
import com.in128mintues.spring.basics.springloosecouplingex4.SpringLooseCouplingEx4Application;

@SpringBootApplication
public class SpringLooseCouplingEx4Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLooseCouplingEx4Application.class, args);
		
	     BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	     
	     int result = binarySearch.binarySearch(new int[] {1,2,3,4,5},3);
			
			System.out.println(result);
	
	}

}
