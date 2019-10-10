package by.epam.javatask;

import by.epam.javatask.filereader.TXTReader;
import by.epam.javatask.validator.StringValidator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        TXTReader txtReader = new TXTReader();
         ArrayList<String> arrayList = txtReader.readFromFile("C:\\Users\\ПЁТР\\IdeaProjects\\java-task-1\\resources\\ReadFromThisFile.txt");
        System.out.println(arrayList);
        StringValidator stringValidator = new StringValidator();
    }
}
