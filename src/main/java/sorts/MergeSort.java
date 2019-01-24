package sorts;

public class MergeSort {

    // Resourced from: https://www.baeldung.com/java-merge-sort
    public static int[] mergeSort(int[] inputArray) {
        // Base case to return array
        int arrLength = inputArray.length;
        if (arrLength < 2) {
            return inputArray;
        }
        // find middle value and left and right side values for iteration
        int midpoint = (int)Math.floor(arrLength/2);
        int[] leftSide = new int[midpoint];
        int[] rightSide = new int[arrLength - midpoint];

        // Left side array creation
        for (int i = 0; i < leftSide.length; i++) {
            leftSide[i] = inputArray[i];
        }
        // Right side array creation
        for (int i = 0; i < rightSide.length; i++) {
            rightSide[i] = inputArray[i + midpoint];
        }
        return merge(mergeSort(leftSide), mergeSort(rightSide));
    }

    public static int[] merge(int[] leftSide, int[] rightSide) {
        // Track array indices
        int i = 0;
        int j = 0;
        int k = 0;

        // Create sorted merge array to return
        int leftLength = leftSide.length;
        int rightLength = rightSide.length;
        int [] mergeArray = new int[leftLength + rightLength];

        // Conditional that checks values and appends lesser value to the mergeArray
        while (i < leftLength && j < rightLength) {

            // Conditional courtesy of Michelle's brilliant mind!
            if ((j == rightLength) || ((i < leftLength) && (leftSide[i] < rightSide[j])))
            {
                mergeArray[k++] = leftSide[i++];
            }
            else {
                mergeArray[k++] = rightSide[j++];
            }
        }

        // Add leftSide and rightSide values to mergeArray;
        while (i < leftLength) {
            mergeArray[k++] = leftSide[i++];
        }
        while (j < rightLength) {
            mergeArray[k++] = rightSide[j++];
        }
        return mergeArray;
    }
}