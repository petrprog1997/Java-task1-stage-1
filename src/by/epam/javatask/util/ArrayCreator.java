package by.epam.javatask.util;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayCreator {

    public int[] createArray() {

        Random random = new Random();

        IntStream Streamarray = random.ints(random.nextInt(15)+1, -20,25);

        int[] array = Streamarray.toArray();

        return array;

    }
}
