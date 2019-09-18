package by.epam.arraymin;

public class arrayMin {

	public String findmin(int[] array) {
		
		int min = array[0];
		int min_i = 0;
		for(int i = 0; i < array.length; i++) {
			
			if(min<array[i]) {
				min = array[i];
				min_i = i;
			}
		}
		return ("Минимальный элемнт массива = " + min + ";\n Индекс минимального элемента массива = " + min_i);
	}
}
