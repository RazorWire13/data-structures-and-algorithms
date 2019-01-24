package sorts;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RadixSortTest {

    @Test
    public void radixSort_TestOnes() {
        int[] testArray = new int[] { 2, 1, 4, 13, 11, 9, 7 };
        int[] expected = new int[] { 1, 2, 4, 7, 9, 11, 13 };
        System.out.println(Arrays.toString(testArray));
        assertEquals("radixSort should return expected array", Arrays.toString(expected), Arrays.toString(RadixSort.radixSort(testArray)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void radixSort_TestTens() {
        int[] testArray = new int[] { 23, 17, 49, 53, 11, 92, 76 };
        int[] expected = new int[] { 11, 17, 23, 49, 53, 76, 92 };
        System.out.println(Arrays.toString(testArray));
        assertEquals("radixSort should return expected array", Arrays.toString(expected), Arrays.toString(RadixSort.radixSort(testArray)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void radixSort_TestHundreds() {
        int[] testArray = new int[] { 257, 138, 435, 191, 984, 862, 701 };
        int[] expected = new int[] { 138, 191, 257, 435, 701, 862, 984 };
        System.out.println(Arrays.toString(testArray));
        assertEquals("radixSort should return expected array", Arrays.toString(expected), Arrays.toString(RadixSort.radixSort(testArray)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void radixSort_TestThousands() {
        int[] testArray = new int[] { 2572, 1389, 4356, 1918, 9847, 8621, 7010 };
        int[] expected = new int[] { 1389, 1918, 2572, 4356, 7010, 8621, 9847 };
        System.out.println(Arrays.toString(testArray));
        assertEquals("radixSort should return expected array", Arrays.toString(expected), Arrays.toString(RadixSort.radixSort(testArray)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void radixSort_TestEmpty() {
        int[] testArray = new int[] { };
        int[] expected = new int[] { };
        System.out.println(Arrays.toString(testArray));
        assertEquals("radixSort should return expected array", Arrays.toString(expected), Arrays.toString(RadixSort.radixSort(testArray)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void radixSort_TestSolo() {
        int[] testArray = new int[] {1};
        int[] expected = new int[] {1};
        System.out.println(Arrays.toString(testArray));
        assertEquals("radixSort should return expected array", Arrays.toString(expected), Arrays.toString(RadixSort.radixSort(testArray)));
        System.out.println(Arrays.toString(testArray));
    }

    @Test
    public void radixSort_TestLength() {
        int[] testArray = new int[] { -2, 1, -4, 13, -11, 9, -7 };
        int expected = 7;
        assertEquals("radixSort should return expected array", expected, testArray.length);
    }

}