package by.epam.javatask.validator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class StringValidatorTest {

    private StringValidator stringValidator = new StringValidator();

    @Test
    public void testValidatorShouldReturnTrue() {
        String sourceString = "     4.2  21   32.342  3.21   -0.321   0.031 ";
        boolean actualResult = stringValidator.isValid(sourceString);
        assertTrue(actualResult);
    }

    @Test
    public void testValidatorShouldReturnFalse() {
        String sourceString = "  22C    FDS3 2F3.4   -321   31   ";
        boolean actualResult = stringValidator.isValid(sourceString);
        assertFalse(actualResult);
    }
}