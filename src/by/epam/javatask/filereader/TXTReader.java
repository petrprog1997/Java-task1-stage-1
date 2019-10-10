package by.epam.javatask.filereader;

import by.epam.javatask.exception.FileException;

import java.io.*;
import java.util.ArrayList;

public class TXTReader {
    
    public ArrayList<String> readFromFile(String path) {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = null;
        try {
            File file = new File(path);
            FileReader filereader = new FileReader(file);
            reader = new BufferedReader(filereader);
            String line;
            while ((line = reader.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new FileException("Файл не найден");
        }
        catch (IOException e) {
            throw new FileException("Ошибка чтения из файла");
        } finally {
            try {
                if(reader != null) reader.close();
            } catch (IOException e) {
                throw new FileException("Ошибка закрытия файла");
            }
        }
        return arrayList;
    }
}
