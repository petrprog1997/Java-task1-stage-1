package test.epam.javatask.util;

import by.epam.javatask.util.ArrayMin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayMinTest {

    private ArrayMin arrayMin = new ArrayMin();

    @Test
    public void testFindMinFirst() {
        double expectedMin = -2331;
        double[] actualArray = {2, 3, 0.4, -2331, 123, 2, 0.1233, 4.2, 123};
        double actualMin = arrayMin.findMin(actualArray);
        Assert.assertEquals(expectedMin,actualMin);
    }

    @Test
    public void testFindMinSecond() {
        double expectedMin = 0.1233;
        double[] actualArray = {2, 3, 0.4, 231, 123, 2, 0.1233, 4.2, 123};
        double actualMin = arrayMin.findMin(actualArray);
        Assert.assertEquals(expectedMin,actualMin);
    }

    @Test
    public void testFindMinThirst() {
        double expectedMin = -123;
        double[] actualArray = {2, 3, 0.4, 0, -123, 2, 0.1233, 4.2, 123};
        double actualMin = arrayMin.findMin(actualArray);
        Assert.assertEquals(expectedMin,actualMin);
    }

    @Test
    public void testFindMinFourth() {
        double expectedMin = 0;
        double[] actualArray = {123, 0.1233, 4.2, 123, 0};
        double actualMin = arrayMin.findMin(actualArray);
        Assert.assertEquals(expectedMin, actualMin);
    }
}