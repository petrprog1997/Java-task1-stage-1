package by.epam.javatask.util;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArraySumTest {

    private ArraySum arraySum = new ArraySum();

    @Test
    public void testShouldReturnSum() {
        double expectedSum = 14.6;
        double[] actualArray = {2, 5, 1, 5.2, 1.4};
        double actualSum = arraySum.findSum(actualArray);
        assertEquals(expectedSum, actualSum);
    }
}