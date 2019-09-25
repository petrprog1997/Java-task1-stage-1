package test.epam.javatask.sort;

import by.epam.javatask.sort.ArraySorter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArraySorterTest {

    private ArraySorter  arraySorter = new ArraySorter();

    @Test
    public void testBubbleSortFirst() {
        double[] expectedSortedArray = {1, 4, 7, 8.2, 12.5};
        double[] actualArray = {7, 4, 8.2, 12.5, 1};
        double[] actualSortedArray = arraySorter.bubbleSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }
    @Test
    public void testBubbleSortSecond() {
        double[] expectedSortedArray = {-4.3 ,-1.2, -1.1, 0.3, 11};
        double[] actualArray = {-1.1, -4.3, -1.2, 0.3, 11};
        double[] actualSortedArray = arraySorter.bubbleSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }



    @Test
    public void testSelectSorFirst() {
        double[] expectedSortedArray = {1, 4, 7, 8.2, 12.5};
        double[] actualArray = {7, 4, 8.2, 12.5, 1};
        double[] actualSortedArray = arraySorter.selectSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }

    @Test
    public void testSelectSorSecond() {
        double[] expectedSortedArray = {-2, 0.122, 0.2, 123};
        double[] actualArray = {0.2, 123 ,-2, 0.122};
        double[] actualSortedArray = arraySorter.selectSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }

    @Test
    public void testInsertionSortFirst() {
        double[] expectedSortedArray = {1, 4, 7, 8.2, 12.5};
        double[] actualArray = {7, 4, 8.2, 12.5, 1};
        double[] actualSortedArray = arraySorter.insertionSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }

    @Test
    public void testInsertionSortSecond() {
        double[] expectedSortedArray = {1, 4, 7, 8.2, 12.5};
        double[] actualArray = {7, 4, 8.2, 12.5, 1};
        double[] actualSortedArray = arraySorter.insertionSort(actualArray);
        Assert.assertEquals(expectedSortedArray,actualSortedArray);
    }
}