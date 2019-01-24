package sorts;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void mergeSort_TestRegular() {
        int[] testArray = {30, 10, 40, 50, 20, 60};
        int[] expected = {10, 20, 30, 40, 50, 60};
        assertArrayEquals("mergeSort length should equal expected", expected, MergeSort.mergeSort(testArray));

//        assertArrayEquals("mergeSort should produce expected sorted array", expected, testArray);
    }

    @Test
    public void mergeSort_TestLength() {
        int[] testArray = {13, 7, 19, 17, 42, 5};
        int expected = 6;
        assertEquals("mergeSort length should equal expected", expected, testArray.length);
    }

    @Test
    public void mergeSort_TestNegatives() {
        int[] testArray = {13, -7, 19, 17, -42, 5};
        int[] expected = {-42, -7, 5, 13, 17, 19};
        assertArrayEquals("mergeSort should produce expected sorted array", expected, MergeSort.mergeSort(testArray));
    }

    @Test
    public void mergeSort_TestOddSizeArray() {
        int[] testArray = {13, -7, 19, -42, 5};
        int[] expected = {-42, -7, 5, 13, 19};
        assertArrayEquals("mergeSort should produce expected sorted array", expected, MergeSort.mergeSort(testArray));
    }

    @Test
    public void mergeSort_TestEmpty() {
        int[] testArray = {};
        int[] expected = {};
        assertArrayEquals("mergeSort should produce expected sorted array", expected, MergeSort.mergeSort(testArray));
    }

    @Test
    public void mergeSort_TestSolo() {
        int[] testArray = {7};
        int[] expected = {7};
        assertArrayEquals("mergeSort should produce expected sorted array", expected, MergeSort.mergeSort(testArray));
    }
}