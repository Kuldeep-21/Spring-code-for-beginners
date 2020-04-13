package com.in28minutes.spring.basics.springloosecouplingex5;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	
public int[] sort(int [] numbers) {
		
		//sorting logic
	System.out.println("Quick sort algorithm");
		
		return(new int [] {1,2,4,5,});
		
	}
	
	

}
