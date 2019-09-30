package by.epam.javatask.myexception;

public class CantFindFileException extends RuntimeException {

    public CantFindFileException(String s){
        System.err.println(s);
    }
}
