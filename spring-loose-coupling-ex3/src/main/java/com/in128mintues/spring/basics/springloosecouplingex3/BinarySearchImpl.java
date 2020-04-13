package com.in128mintues.spring.basics.springloosecouplingex3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class BinarySearchImpl {
	@Autowired
	//private SortAlgorithm quickSortAlgorithm;
	private SortAlgorithm quickSortAlgorithm;
	//private SortAlgorithm SortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm quickSortAlgorithm) {
		super();
		this.quickSortAlgorithm = quickSortAlgorithm;
	}


	public int binarySearch(int numbers[],int numbertosearch)
	{
	
		//quickSortAlgorithm sortAlgo = new QuickquickSortAlgorithm();
		//quickSortAlgorithm sortAlgo = new BubblequickSortAlgorithm();
	
			
		//BubblequickSortAlgorithm bubblesort = new BubblequickSortAlgorithm();
		//QuickquickSortAlgorithm quicksort = new QuickquickSortAlgorithm();
		
		//int sortedNumbers [] =  bubblesort.sort(numbers);
		//int sortedNumbers [] =  quicksort.sort(numbers);
		
		
		int sortedNumbers [] =  quickSortAlgorithm.sort(numbers);
		System.out.println("sorting algo "+quickSortAlgorithm);
		
	//searching the element
	//return  the element
		
		return 35;
	}
}
