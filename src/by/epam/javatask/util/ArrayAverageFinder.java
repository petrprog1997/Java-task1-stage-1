package by.epam.javatask.util;

public class ArrayAverageFinder {

    public double findAverage(double[] array) {

        double sum = 0;

        for(double item : array) {

            sum += item;

        }

        double average = sum/array.length;
        System.out.println(average);
        return average;
    }
}
