package by.epam.javatask.myexception;

public class NotAccessToFileException extends RuntimeException {

    public NotAccessToFileException(String s){
        System.err.println(s);
    }

}
