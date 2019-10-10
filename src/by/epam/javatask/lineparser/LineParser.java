package by.epam.javatask.lineparser;

public class LineParser {

    public static double[] parse(String string) {
        string = string.trim().replaceAll("\\s{2,}", " ");
        String[] arrayString = string.split(" ");
        double[] array = new double[arrayString.length];
        int arrayLength = array.length;
            for (int i = 0; i<arrayLength; i++){
               array[i] = Double.parseDouble(arrayString[i]);
           }
        return array;
    }
}
