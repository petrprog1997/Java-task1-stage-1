package by.epam.javatask.pars;

import by.epam.javatask.filereader.MyFileReader;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<double[]> arrayList =  MyFileReader.readFromFile();

        System.out.println(arrayList.toArray());

    }
}