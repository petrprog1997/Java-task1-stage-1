package by.epam.javatask.creator;

import java.util.Random;
import java.util.stream.DoubleStream;

public class ArrayCreator {

    public double[] createArray() {
        Random random = new Random();
        DoubleStream StreamArray = random.doubles(random.nextInt(15)+1, -20,25);
        double[] array = StreamArray.toArray();
        return array;
    }
}
