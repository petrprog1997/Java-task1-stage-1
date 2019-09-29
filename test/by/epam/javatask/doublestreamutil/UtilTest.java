package by.epam.javatask.doublestreamutil;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UtilTest {

    Util util = new Util();

    @Test
    public void testShouldReturnMin() {
        double expectedMin = -2331;
        double[] actualArray = {2, 3, 0.4, -2331, 123, 2, 0.1233, 4.2, 123};
        double actualMin = util.findMin(actualArray);
        assertEquals(expectedMin,actualMin);
    }

    @Test
    public void testShouldReturnMax() {
        double expectedMax = 123;
        double[] actualArray = {2,3,0.4,-2331, 123, 2, 0.1233, 4.2, 123};
        double actualMax = util.findMax(actualArray);
        assertEquals(expectedMax,actualMax);
    }

    @Test
    public void testShouldReturnAverage() {
        double expectedResult = 2.45;
        double[] actualArray  = {1.5, 3.4};
        double actualResult = util.findAverage(actualArray);
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testShouldReturnSum() {
        double expectedSum = 14.6;
        double[] actualArray = {2, 5, 1, 5.2, 1.4};
        double actualSum = util.findSum(actualArray);
        assertEquals(expectedSum, actualSum);
    }
}