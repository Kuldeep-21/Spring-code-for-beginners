package com.in28minutes.spring.basics.springloosecouplingex5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class BinarySearchImpl {
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithm sortAlgorithm;
	//private SortAlgorithm SortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int numbers[],int numbertosearch)
	{
	
		//sortAlgorithm sortAlgo = new QuicksortAlgorithm();
		//sortAlgorithm sortAlgo = new BubblesortAlgorithm();
	
			
		//BubblesortAlgorithm bubblesort = new BubblesortAlgorithm();
		//QuicksortAlgorithm quicksort = new QuicksortAlgorithm();
		
		//int sortedNumbers [] =  bubblesort.sort(numbers);
		//int sortedNumbers [] =  quicksort.sort(numbers);
		
		
		int sortedNumbers [] =  sortAlgorithm.sort(numbers);
		System.out.println("sorting algo "+sortAlgorithm);
		
	//searching the element
	//return  the element
		
		return 35;
	}
}
