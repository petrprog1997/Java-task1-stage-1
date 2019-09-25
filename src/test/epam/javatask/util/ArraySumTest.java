package test.epam.javatask.util;

import by.epam.javatask.util.ArraySum;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySumTest {

    private ArraySum arraySum = new ArraySum();

    @Test
    public void testFindMinFirst() {
            double expectedSum = 14.6;
            double[] actualArray = {2, 5, 1, 5.2, 1.4};
            double actualSum = arraySum.findSum(actualArray);
            Assert.assertEquals(expectedSum,actualSum);
    }

    @Test
    public void testFindMinSecond() {
        double expectedSum = 3.69;
        double[] actualArray = {0.3, 0.5, 0.43, 0.23, 2.23};
        double actualSum = arraySum.findSum(actualArray);
        Assert.assertEquals(expectedSum,actualSum);
    }

    @Test
    public void testFindMinThird() {
        double expectedSum = 12.5;
        double[] actualArray = {-1, 5.1, 5, 3.4};
        double actualSum = arraySum.findSum(actualArray);
        Assert.assertEquals(expectedSum,actualSum);
    }
}