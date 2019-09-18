package by.epam.arraysum;

public class arraySum {
	
	public int sum(int[] array) {
		
		int sum = 0;
		
		for(int element : array ) {
			sum+= element;
		}
		return sum;
	}
}
