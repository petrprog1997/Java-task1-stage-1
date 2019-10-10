package by.epam.javatask.util;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArraySumTest {

    private  ArrayUtil arrayUtil = new ArrayUtil();

    @Test
    public void testShouldReturnSum() {
        double expectedSum = 14.6;
        double[] actualArray = {2, 5, 1, 5.2, 1.4};
        double actualSum = arrayUtil.findSum(actualArray);
        assertEquals(expectedSum, actualSum);
    }
}