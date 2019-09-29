package by.epam.javatask.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyValidator {

    public static final String REGEXP = "^(\\s*[+-]?\\d+(\\.\\d+)?(d|D)?(\\s+|$))+$";

    public static boolean isValid(String string) {

        Pattern pattern = Pattern.compile(REGEXP);

        Matcher matcher = pattern.matcher(string);

        boolean found = matcher.matches();

            return found;

    }
}

