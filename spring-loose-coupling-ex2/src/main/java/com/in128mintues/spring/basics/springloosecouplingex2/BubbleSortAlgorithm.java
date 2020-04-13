package com.in128mintues.spring.basics.springloosecouplingex2;

import org.springframework.stereotype.Component;

@Component
public class BubbleSortAlgorithm implements SortAlgorithm {

 public int[] sort(int [] numbers) {
		
		//sorting logic
	 
	 System.out.println("Bubble sort Algorithm");
		
		return(new int [] {1,2,4,5,});
		
	}
	
	
}
