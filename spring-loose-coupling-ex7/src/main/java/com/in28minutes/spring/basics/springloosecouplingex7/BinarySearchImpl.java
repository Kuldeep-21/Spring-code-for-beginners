package com.in28minutes.spring.basics.springloosecouplingex7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component 
//@Scope("prototype")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//by default scope in singleton
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
