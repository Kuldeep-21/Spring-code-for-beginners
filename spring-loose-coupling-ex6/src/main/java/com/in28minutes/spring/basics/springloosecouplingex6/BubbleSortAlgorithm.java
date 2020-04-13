package com.in28minutes.spring.basics.springloosecouplingex6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

 public int[] sort(int [] numbers) {
		
		//sorting logic
	 
	 System.out.println("Bubble sort Algorithm");
		
		return(new int [] {1,2,4,5,});
		
	}
	
	
}
