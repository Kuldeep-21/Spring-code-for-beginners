package com.in128mintues.spring.basics.springloosecouplingex2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int numbers[],int numbertosearch)
	{
	
		//SortAlgorithm sortAlgo = new QuickSortAlgorithm();
		//SortAlgorithm sortAlgo = new BubbleSortAlgorithm();
	
			
		//BubbleSortAlgorithm bubblesort = new BubbleSortAlgorithm();
		//QuickSortAlgorithm quicksort = new QuickSortAlgorithm();
		
		//int sortedNumbers [] =  bubblesort.sort(numbers);
		//int sortedNumbers [] =  quicksort.sort(numbers);
		
		
		int sortedNumbers [] =  sortAlgorithm.sort(numbers);
		System.out.println("sorting algo "+sortAlgorithm);
		
	//searching the element
	//return  the element
		
		return 23;
	}
}
