package by.epam.javatask.util;

public class ArraySum {

    public double findSum(double[] array) {

        double sum = 0;

        for(double element : array ) {
            sum+= element;
        }
        return sum;
    }
}
