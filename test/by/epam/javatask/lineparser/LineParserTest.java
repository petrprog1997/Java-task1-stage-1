package by.epam.javatask.lineparser;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LineParserTest {


    private static double[] expectedArray = {1, 4, 2, 1, 4.2, 2.3};
    private static String actualString = "  1   4  2  1   4.2    2.3  ";

    @Test
    public void ShouldReturnTrue() {
        double[] actualArray = LineParser.parse(actualString);
        assertEquals(expectedArray, actualArray);
    }
}