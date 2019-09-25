package by.epam.javatask.intstreamutil;

import java.util.stream.DoubleStream;

public class Util {

    public  Double min(double[] array){
        return DoubleStream.of(array).summaryStatistics().getMin();
    }

    public  Double max(double[] array){
        return DoubleStream.of(array).summaryStatistics().getMax();
    }

    public  Double average(double[] array){
        return DoubleStream.of(array).summaryStatistics().getAverage();
    }

    public  Double sum(double[] array){
        return DoubleStream.of(array).summaryStatistics().getSum();
    }



}
