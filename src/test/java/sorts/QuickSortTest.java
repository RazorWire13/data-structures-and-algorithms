package sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {

    @Test
    public void quickSort_TestRegular() {
        int[] testArray = new int[] { 2, 1, 4, 13, 11, 9, 7 };
        int[] expected = new int[] { 1, 2, 4, 7, 9, 11, 13 };
        System.out.println(Arrays.toString(testArray));
        assertEquals("quickSort should return expected array", Arrays.toString(expected), Arrays.toString(QuickSort.quickSort(testArray, 0, testArray.length - 1)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void quickSort_TestNegatives() {
        int[] testArray = new int[] { -2, 1, -4, 13, -11, 9, -7 };
        int[] expected = new int[] { -11, -7, -4, -2, 1, 9, 13 };
        System.out.println(Arrays.toString(testArray));
        assertEquals("quickSort should return expected array", Arrays.toString(expected), Arrays.toString(QuickSort.quickSort(testArray, 0, testArray.length - 1)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void quickSort_TestEmpty() {
        int[] testArray = new int[] { };
        int[] expected = new int[] { };
        System.out.println(Arrays.toString(testArray));
        assertEquals("quickSort should return expected array", Arrays.toString(expected), Arrays.toString(QuickSort.quickSort(testArray, 0, testArray.length - 1)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void quickSort_TestSolo() {
        int[] testArray = new int[] {1};
        int[] expected = new int[] {1};
        System.out.println(Arrays.toString(testArray));
        assertEquals("quickSort should return expected array", Arrays.toString(expected), Arrays.toString(QuickSort.quickSort(testArray, 0, testArray.length - 1)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void quickSort_TestLength() {
        int[] testArray = new int[] { -2, 1, -4, 13, -11, 9, -7 };
        int expected = 7;
        assertEquals("quickSort should return expected array", expected, testArray.length);
    }

}