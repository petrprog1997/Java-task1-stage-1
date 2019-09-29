package by.epam.javatask.sort;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySorterTest {

    private ArraySorter  arraySorter = new ArraySorter();
    private static double[] expectedSortedArray = {1, 4, 7, 8.2, 12.5};
    private static double[] actualArray = {7, 4, 8.2, 12.5, 1};

    @Test
    public void testBubbleSortShouldReturnSortedArray() {

        double[] actualSortedArray = arraySorter.bubbleSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }

    @Test
    public void testSelectSortShouldReturnSortedArray() {

        double[] actualSortedArray = arraySorter.selectSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }

    @Test
    public void testInsertionSortShouldReturnSortedArray() {

        double[] actualSortedArray = arraySorter.insertionSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }
}