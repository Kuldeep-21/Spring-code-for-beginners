package com.in28minutes.spring.basics.springloosecouplingex5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {

 public int[] sort(int [] numbers) {
		
		//sorting logic
	 
	 System.out.println("Bubble sort Algorithm");
		
		return(new int [] {1,2,4,5,});
		
	}
	
	
}
