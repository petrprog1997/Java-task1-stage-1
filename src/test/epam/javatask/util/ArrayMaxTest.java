package test.epam.javatask.util;

import by.epam.javatask.util.ArrayMax;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayMaxTest {

    private ArrayMax arrayMax = new ArrayMax();

    @Test
    public void testFindMaxFirst() {
        double expectedMax = 123;
        double[] actualArray = {2,3,0.4,-2331, 123, 2, 0.1233, 4.2, 123};
        double actualMax = arrayMax.findMax(actualArray);
        Assert.assertEquals(expectedMax,actualMax);
    }

    @Test
    public void testFindMaxSecond() {
        double expectedMax = 5553;
        double[] actualArray = {35,-34,5553,0.34,32};
        double actualMax = arrayMax.findMax(actualArray);
        Assert.assertEquals(expectedMax,actualMax);
    }

    @Test
    public void testFindMaxThird() {
        double expectedMax = 0;
        double[] actualArray = {-2,0,-34.45,-54};
        double actualMax = arrayMax.findMax(actualArray);
        Assert.assertEquals(expectedMax,actualMax);
    }
    @Test
    public void testFindMaxFourth() {
        double expectedMax = -1;
        double[] actualArray = {-12,-5345,-452,-24,-1};
        double actualMax = arrayMax.findMax(actualArray);
        Assert.assertEquals(expectedMax,actualMax);
    }

    @Test
    public void testFindMaxFifth() {
        double expectedMax = 0.98;
        double[] actualArray = {0.44,-0.3, 0.98,0};
        double actualMax = arrayMax.findMax(actualArray);
        Assert.assertEquals(expectedMax,actualMax);
    }

    @Test
    public void testFindMaxSixth() {
        double expectedMax = 1324343;
        double[] actualArray = {1324343,432423,423441,55545};
        double actualMax = arrayMax.findMax(actualArray);
        Assert.assertEquals(expectedMax,actualMax);
    }
}