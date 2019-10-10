package by.epam.javatask.util;

public class ArrayUtil {

    public double findMax(double[] array) {
        double max = array[0];
        for(int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public double findMin(double[] array) {
        double min = array[0];
        for(int i = 0; i < array.length; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public double findSum(double[] array) {
        double sum = 0;
        for(double element : array ) {
            sum += element;
        }
        return sum;
    }

    public double findAverage(double[] array) {
        double sum = 0;
        for(double element : array) {
            sum += element;
        }
        double average = sum/array.length;
        return average;
    }
}
