package by.epam.arraysort;

public class arraySort {

	public int[] bubblesort(int[] array) {
		
		boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < array.length - 1; i++) {
	            if (array[i] > array[i+1]) {
	                temp = array[i];
	                array[i] = array[i+1];
	                array[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	    return array;
	}
	
	
	public int[] selectsort(int[] array) {
		
		 for (int i = 0; i < array.length; i++) {
		        int min = array[i];
		        int minId = i;
		        for (int j = i+1; j < array.length; j++) {
		        	
		            if (array[j] < min) {
		                min = array[j];
		                minId = j;
		            }
		        }
		        
		        int temp = array[i];
		        array[i] = min;
		        array[minId] = temp;
		    }
		 
		return array;
	}
	
	public int[] insertionsort(int[] array) {
		
		 for (int i = 1; i < array.length; i++) {
		        int current = array[i];
		        int j = i - 1;
		        while(j >= 0 && current < array[j]) {
		            array[j+1] = array[j];
		            j--;
		        }
		        array[j+1] = current;
		    }
		 return array;
	}
}
