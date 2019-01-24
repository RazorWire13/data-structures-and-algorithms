package sorts;

public class QuickSort {

    // Resourced code:
    // https://www.baeldung.com/java-quicksort
    // https://howtodoinjava.com/algorithm/quicksort-java-example/
    public static int[] quickSort(int[] inputArray, int start, int end) {

        // base case comparing start value to end
        if (start >= end) {
            return inputArray;
        }

        // define pivot value from mid-array
        int midpoint = start + (end - start) / 2;
        int pivot = inputArray[midpoint];

        // set values left and right of pivot
        int i = start;
        int j = end;
        while (i <= j) {

            // loop through all left values until values are less than pivot
            while (inputArray[i] < pivot) {
                i++;
            }

            // loop through all right values until values are greater than pivot
            while (inputArray[j] > pivot) {
                j--;
            }

            // compare both lists' values to sort them
            if (i <= j) {
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
                j--;
            }
        }

        // use recursion to sort arrays
        if (start < j) {
            quickSort(inputArray, start, j);
        }
        if (end > i) {
            quickSort(inputArray, i, end);
        }
        return inputArray;
    }
}
