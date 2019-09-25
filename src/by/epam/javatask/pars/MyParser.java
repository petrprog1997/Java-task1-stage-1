package by.epam.javatask.pars;

public class MyParser {

    public static double[] parse(String string){

        double[] array = new double[string.length()];

        string = string.trim().replaceAll("\\s{2,}", " ");;

        String[] arrayString = string.split(" ");

           for (int i = 0; i<arrayString.length; i++){

               array[i] = Double.parseDouble(arrayString[i]);

           }
        return array;
    }
}
