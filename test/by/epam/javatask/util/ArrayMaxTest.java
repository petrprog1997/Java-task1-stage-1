package by.epam.javatask.util;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArrayMaxTest {

    private  ArrayUtil arrayUtil = new ArrayUtil();

    @Test
    public void shouldReturnMax() {
        double expectedMax = 123;
        double[] actualArray = {2,3,0.4,-2331, 123, 2, 0.1233, 4.2, 123};
        double actualMax = arrayUtil.findMax(actualArray);
        assertEquals(expectedMax,actualMax);
    }
}