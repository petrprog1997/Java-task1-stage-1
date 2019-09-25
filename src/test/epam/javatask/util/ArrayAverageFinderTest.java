package test.epam.javatask.util;

import by.epam.javatask.util.ArrayAverageFinder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayAverageFinderTest {

    private  ArrayAverageFinder arrayAverageFinder = new ArrayAverageFinder();

    @Test
    public  void shouldReturnAverageFirst(){
        double expectedResult = 2;
        double[] actualArray  = {1, 3};
        double actualResult = arrayAverageFinder.findAverage(actualArray);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test
    public  void shouldReturnAverageSecond(){
        double expectedResult = 8;
        double[] actualArray  = {8};
        double actualResult = arrayAverageFinder.findAverage(actualArray);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public  void shouldReturnAverageThird(){
        double expectedResult = -4;
        double[] actualArray  = {-6, -3, -4, -4, -3};
        double actualResult = arrayAverageFinder.findAverage(actualArray);
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public  void shouldReturnAverageFourth(){
        double expectedResult = -2.6;
        double[] actualArray  = {-4.2, -3.7, -8.1, -2, 5 };
        double actualResult = arrayAverageFinder.findAverage(actualArray);
        Assert.assertEquals(actualResult, expectedResult);
    }
}