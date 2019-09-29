package by.epam.javatask.doublestreamutil;

import java.util.stream.DoubleStream;

public class Util {

    public  Double findMin(double[] array){
        return DoubleStream.of(array).summaryStatistics().getMin();
    }

    public  Double findMax(double[] array){
        return DoubleStream.of(array).summaryStatistics().getMax();
    }

    public  Double findAverage(double[] array){
        return DoubleStream.of(array).summaryStatistics().getAverage();
    }

    public  Double findSum(double[] array){
        return DoubleStream.of(array).summaryStatistics().getSum();
    }
}
