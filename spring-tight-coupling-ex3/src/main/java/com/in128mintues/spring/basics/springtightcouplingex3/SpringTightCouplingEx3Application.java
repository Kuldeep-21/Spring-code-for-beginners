package com.in128mintues.spring.basics.springtightcouplingex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in128mintues.spring.basics.springtightcouplingex3.BinarySearchImpl;

@SpringBootApplication
public class SpringTightCouplingEx3Application {

	public static void main(String[] args) {
		
		//BinarySearchImpl searchImpl = new BinarySearchImpl(new BubbleSortAlgorithm());
		BinarySearchImpl searchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		
		int result = searchImpl.binarySearch(new int[] {1,2,3,4,5},3);
		
		System.out.println(result);

		SpringApplication.run(SpringTightCouplingEx3Application.class, args);
	}

}
