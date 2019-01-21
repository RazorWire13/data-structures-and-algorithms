package sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sortResult = new InsertionSort();
        int[] arr = {3, 2, 1};

        System.out.println("Sorted array: " + Arrays.toString(sortResult.insertionSort(arr)));
    }

    // Resourced from: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
    public int[] insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    System.out.println("Pre-sort array   " + Arrays.toString(arr) + " [Outer " + i + " / Inner " + j + "]");
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    System.out.println("Post-sort array  " + Arrays.toString(arr) + " [Outer " + i + " / Inner " + j + "]");
                }
            }
        }
        return arr;
    }
}
