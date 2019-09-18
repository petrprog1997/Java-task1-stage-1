package by.epam.main;

import java.util.Arrays;

import by.epam.arraycreate.createArray;
import by.epam.arraysort.arraySort;

public class Main {

	public static void main(String[] args) {
		
		createArray array = new createArray();
		
		int sourseArray[] = array.createarray();
		
		System.out.println(Arrays.toString(sourseArray));
		
		arraySort sortArray = new arraySort();
		
		sourseArray = sortArray.bubblesort(sourseArray);
		
		System.out.print(Arrays.toString(sourseArray));
		
	}
	
}
