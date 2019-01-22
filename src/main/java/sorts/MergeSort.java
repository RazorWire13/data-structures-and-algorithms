package sorts;

public class MergeSort {

    // Resourced from: https://www.baeldung.com/java-merge-sort
    public static void mergeSort(int[] input, int n) {
        if (n < 2) {
            return;
        }
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = input[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = input[i];
        }
        mergeSort(left, mid);
        mergeSort(right, n - mid);
        merge(input, left, right, mid, n - mid);
    }

    public static void merge(int[] input, int[] leftArray, int[] rightArray, int leftLength, int rightLength) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                input[k++] = leftArray[i++];
            }
            else {
                input[k++] = rightArray[j++];
            }
        }
        while (i < leftLength) {
            input[k++] = leftArray[i++];
        }
        while (j < rightLength) {
            input[k++] = rightArray[j++];
        }
    }
}
