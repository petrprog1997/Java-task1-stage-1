package by.epam.arrayaverage;

public class arrayAverage {

	public double average(int[] array) {
		
		int sum = 0;
		
		for(int item : array) {
	
			sum += item;
			
		}
		
		double average = sum/array.length;
		
	return average;
	} 
}
