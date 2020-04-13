package com.in128mintues.spring.basics.springtightcoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringTightCouplingApplication {

	public static void main(String[] args) {
		
		BinarySearchImpl searchImpl = new BinarySearchImpl();
				
			int result = searchImpl.binarySearch(new int[] {1,2,3,4,5},3);
			
			System.out.println(result);
		
		SpringApplication.run(SpringTightCouplingApplication.class, args);
		
	}

}
