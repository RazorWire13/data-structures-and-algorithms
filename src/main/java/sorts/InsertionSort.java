package sorts;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sortResult = new InsertionSort();
        int[] arr = {1, -3, 1, 0, 0};

        System.out.println(Arrays.toString(sortResult.insertionSort(arr)));
    }

    // Resourced from: http://www.java2novice.com/java-sorting-algorithms/insertion-sort/
    public int[] insertionSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j -1];
                    arr[j -1] = temp;
                }
            }
        }
        return arr;
    }

    // Resourced from https://www.geeksforgeeks.org/insertion-sort/
    public static void printSort(int arr[]) {
        for (int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i] + " ");
        }
    }
}
