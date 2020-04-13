package com.in128mintues.spring.basics.springloosecouplingex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.in128mintues.spring.basics.springloosecouplingex3.BinarySearchImpl;
import com.in128mintues.spring.basics.springloosecouplingex3.SpringLooseCouplingEx3Application;

@SpringBootApplication
public class SpringLooseCouplingEx3Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringLooseCouplingEx3Application.class, args);
		
	     BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	     
	     int result = binarySearch.binarySearch(new int[] {1,2,3,4,5},3);
			
			System.out.println(result);
	}

}
