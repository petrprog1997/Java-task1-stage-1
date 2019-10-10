package by.epam.javatask.util;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ArrayAverageFinderTest {

    private  ArrayUtil arrayUtil = new ArrayUtil();

    @Test
    public void shouldReturnAverage(){
        double expectedResult = 2.45;
        double[] actualArray  = {1.5, 3.4};
        double actualResult = arrayUtil.findAverage(actualArray);
        assertEquals(actualResult, expectedResult);
    }
}