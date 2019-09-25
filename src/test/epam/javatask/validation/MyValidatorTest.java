package test.epam.javatask.validation;

import by.epam.javatask.validation.MyValidator;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class MyValidatorTest {

    private MyValidator myValidator = new MyValidator();

    @Test
    public void testIsValidFirst() {

        String sourceString = "221 323 321 31 ";
        boolean actualResult = myValidator.isValid(sourceString);
        assertTrue(actualResult);
    }

    @Test
    public void testIsValidSecond() {

        String sourceString = "22C FDS32F3 -321 31 ";
        boolean actualResult = myValidator.isValid(sourceString);
        assertFalse(actualResult);
    }


}