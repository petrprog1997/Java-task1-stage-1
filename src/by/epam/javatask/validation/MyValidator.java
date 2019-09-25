package by.epam.javatask.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyValidator {

    public static final String REGEXP = "(\\d+|\\s*(\\s*)(?:[.-]*))+";

    public static boolean isValid(String string) {

        Pattern pattern = Pattern.compile(REGEXP);

        Matcher matcher = pattern.matcher(string);

        boolean found = matcher.matches();

        if (found) {
            return true;
        } else {
            return false;
        }
    }
}

