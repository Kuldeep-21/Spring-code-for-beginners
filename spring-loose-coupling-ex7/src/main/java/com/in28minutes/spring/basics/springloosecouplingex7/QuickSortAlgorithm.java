package com.in28minutes.spring.basics.springloosecouplingex7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class QuickSortAlgorithm implements SortAlgorithm{
	
public int[] sort(int [] numbers) {
		
		//sorting logic
	System.out.println("Quick sort algorithm");
		
		return(new int [] {1,2,4,5,});
		
	}
	
	

}
