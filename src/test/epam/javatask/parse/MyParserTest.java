package test.epam.javatask.parse;

import by.epam.javatask.pars.MyParser;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyParserTest {

    private MyParser myParser = new MyParser();
    @Test
    public void testParse() {
        double[] expectedArray = {1, 4, 2, 1, 4.2, 2.3};
        String actualString = "  1   4  2  1   4.2    2.3  ";
        double[] actualArray = myParser.parse(actualString);
        assertEquals(expectedArray, actualArray);
    }
}