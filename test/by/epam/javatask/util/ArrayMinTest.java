package by.epam.javatask.util;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class ArrayMinTest {

    private  ArrayUtil arrayUtil = new ArrayUtil();

    @Test
    public void testShouldReturnMin() {
        double expectedMin = -2331;
        double[] actualArray = {2, 3, 0.4, -2331, 123, 2, 0.1233, 4.2, 123};
        double actualMin = arrayUtil.findMin(actualArray);
        assertEquals(expectedMin,actualMin);
    }
}