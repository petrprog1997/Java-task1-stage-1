package by.epam.javatask.exception;

public class FileException extends RuntimeException {

    public FileException(String s) {
        System.err.println(s);
    }
}
