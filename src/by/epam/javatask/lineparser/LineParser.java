package by.epam.javatask.lineparser;

public class LineParser {

    public static double[] parse(String string) {
        double[] array = new double[string.length()];
        string = string.trim().replaceAll("\\s{2,}", " ");
        String[] arrayString = string.split(" ");
        int arrayLength = arrayString.length;
            for (int i = 0; i<arrayLength; i++){
               array[i] = Double.parseDouble(arrayString[i]);
           }
        return array;
    }
}
