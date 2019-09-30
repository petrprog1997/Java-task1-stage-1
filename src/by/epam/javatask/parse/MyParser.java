package by.epam.javatask.parse;

import by.epam.javatask.convert.Converter;
import by.epam.javatask.myexception.CantFindFileException;
import by.epam.javatask.myexception.FileNotClosableException;
import by.epam.javatask.myexception.NotAccessToFileException;
import by.epam.javatask.validation.MyValidator;

import java.io.*;
import java.util.ArrayList;

public class MyParser {

    public  static ArrayList<double[]> readFromFile() {

        ArrayList<double[]> arrayList = new ArrayList<>();

        BufferedReader reader = null;

        try {

            File file = new File("ReadFromThisFile.txt");

            FileReader filereader = new FileReader(file);

            reader = new BufferedReader(filereader);

            String line;

            while ((line = reader.readLine())!=null){

                if(MyValidator.isValid(line)) {

                    arrayList.add(Converter.convert(line));
                }
            }

        } catch (FileNotFoundException e) {

            throw new CantFindFileException("Файл не найден");

        }
        catch (IOException e) {

            throw new NotAccessToFileException("Ошибка чтения из файла");

        } finally {

            try {

                if(reader!=null) reader.close();

            } catch (IOException e) {

                throw new FileNotClosableException("Ошибка закрытия файла");
            }
        }
        return arrayList;
    }
}
