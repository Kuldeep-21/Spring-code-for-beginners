package com.in128mintues.spring.basics.springtightcoupling;

public class BinarySearchImpl {

	public int binarySearch(int numbers[],int numbertosearch)
	{
	
		//SortAlgorithm sortAlgo = new QuickSortAlgorithm();
		SortAlgorithm sortAlgo = new BubbleSortAlgorithm();
	
		
		//BubbleSortAlgorithm bubblesort = new BubbleSortAlgorithm();
		//QuickSortAlgorithm quicksort = new QuickSortAlgorithm();
		
		//int sortedNumbers [] =  bubblesort.sort(numbers);
		//int sortedNumbers [] =  quicksort.sort(numbers);
		
		
		int sortedNumbers [] =  sortAlgo.sort(numbers);
		
	//searching the element
	//return  the element
		
		return 10;
	}
}
