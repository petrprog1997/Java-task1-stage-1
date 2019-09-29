package by.epam.javatask.util;

 public class ArrayMax {

    public double findMax(double[] array) {
        
        double max = array[0];

        for(int i = 0; i < array.length; i++) {

            if(max<array[i]) {

                max = array[i];
            }
        }

        return max;
    }
}
