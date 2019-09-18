package by.epam.arraycreate;

import java.util.Random;

public class createArray {

	public int[] createarray() {
		
		Random random = new Random();
		
		int array[] = new int[random.nextInt(10)+1];
		
		for(int i = 0; i<array.length; i++) {
			array[i]= random.nextInt(20);
		}
		
		return array;
		
	}
}
