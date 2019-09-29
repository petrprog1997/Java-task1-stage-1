package by.epam.javatask.myexception;


public class FileNotClosableException extends RuntimeException {

    public FileNotClosableException(String s){
        System.err.println(s);
    }
}
