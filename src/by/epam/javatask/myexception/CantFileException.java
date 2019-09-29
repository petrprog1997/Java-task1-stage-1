package by.epam.javatask.myexception;

public class CantFileException extends RuntimeException {

    public CantFileException(String s){
        System.err.println(s);
    }
}
