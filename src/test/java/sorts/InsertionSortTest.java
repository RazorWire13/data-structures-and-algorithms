package sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void insertionSortReturn_TestRegular() {
        InsertionSort sortTest = new InsertionSort();
        int[] arr = {13, 19, 42, 7, 3};
        int[] expected = {3, 7, 13, 19, 42};
        assertEquals("sortTest actual equals expected", Arrays.toString(expected), Arrays.toString(sortTest.insertionSort(arr)));
    }

    @Test
    public void insertionSortReturn_TestNegative() {
        InsertionSort sortTest = new InsertionSort();
        int[] arr = {13, -19, 42, 7, -3};
        int[] expected = {-19, -3, 7, 13, 42};
        assertEquals("sortTest actual equals expected", Arrays.toString(expected), Arrays.toString(sortTest.insertionSort(arr)));
    }

    @Test
    public void insertionSortReturn_TestSomeOctalInts() {
        InsertionSort sortTest = new InsertionSort();
        int[] arr = {03, 7, 02, 9, 07};
        int[] expected = {2, 3, 7, 7, 9};
        assertEquals("sortTest actual equals expected", Arrays.toString(expected), Arrays.toString(sortTest.insertionSort(arr)));
    }

    @Test
    public void insertionSortReturn_TestLength() {
        InsertionSort sortTest = new InsertionSort();
        int[] arr = {13, 19, 42, 7, 3};
        int actual = arr.length;
        int expected = 5;
        assertEquals("sortTest length equals expected", expected, actual);
    }

    @Test
    public void insertionSortReturn_TestZero() {
        InsertionSort sortTest = new InsertionSort();
        int[] arr = {0};
        int[] expected = {0};
        assertEquals("sortTest actual equals expected", Arrays.toString(expected), Arrays.toString(sortTest.insertionSort(arr)));
    }

    @Test
    public void insertionSortReturn_TestReverse() {
        InsertionSort sortTest = new InsertionSort();
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 10, 10};
        assertEquals("sortTest actual equals expected", Arrays.toString(expected), Arrays.toString(sortTest.insertionSort(arr)));
    }

    @Test
    public void insertionSortReturn_TestDuplicates() {
        InsertionSort sortTest = new InsertionSort();
        int[] arr = {10, 10, 8, 8, 6, 6, 6, 3, 2, 1};
        int[] expected = {1, 2, 3, 6, 6, 6, 8, 8, 10, 10};
        assertEquals("sortTest actual equals expected", Arrays.toString(expected), Arrays.toString(sortTest.insertionSort(arr)));
    }
}