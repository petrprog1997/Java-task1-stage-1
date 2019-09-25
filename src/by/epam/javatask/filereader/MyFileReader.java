package by.epam.javatask.filereader;

import by.epam.javatask.pars.MyParser;
import by.epam.javatask.validation.MyValidator;

import java.io.*;
import java.util.ArrayList;

public class MyFileReader {

    public  static ArrayList<double[]> readFromFile() {

        ArrayList<double[]> arrayList = new ArrayList<>();

        BufferedReader reader = null;

        try {

            File file = new File("C:\\Users\\ПЁТР\\IdeaProjects\\java-task-1\\ReadFromThisFile.txt");

            FileReader filereader = new FileReader(file);

            reader = new BufferedReader(filereader);

            String line;

            int i = 0;
            while ((line = reader.readLine())!=null){
                if(MyValidator.isValid(line)) {
                    arrayList.add(MyParser.parse(line));
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println("Файл не найден");
        }
        catch (IOException e) {

            System.out.println("Ошибка чтения из файла");

        } finally {

            try {

                if(reader!=null) reader.close();

            } catch (IOException e) {

                System.out.println("Ошибка закрытия файла");
            }
        }
        return arrayList;
    }
}
