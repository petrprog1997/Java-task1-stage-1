package by.epam.arraymax;

public class arrayMax {

	public String findmin(int[] array) {
		
		int max = array[0];
		int max_i = 0;
		for(int i = 0; i < array.length; i++) {
			
			if(max>array[i]) {
				max = array[i];
				max_i = i;
			}
		}
		return ("Мак�?имальный �?лемнт ма�?�?ива = " + max + ";\n Индек�? мак�?имального �?лемента ма�?�?ива = " + max_i);
	}
}
