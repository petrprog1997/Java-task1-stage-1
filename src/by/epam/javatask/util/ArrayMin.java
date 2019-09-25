package by.epam.javatask.util;

public class ArrayMin {

    public double findMin(double[] array) {

        double min = array[0];

        for(int i = 0; i < array.length; i++) {

            if(min>array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
