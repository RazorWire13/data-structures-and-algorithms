package sorts;

import java.util.ArrayList;
import java.util.List;

public class RadixSort {

    // Resourced from: http://www.java67.com/2018/03/how-to-implement-radix-sort-in-java.html
    public static int[] radixSort(int[] inputArray) {
        int bucketSize = 10;

        // create arraylist to use for sorting
        List<Integer>[] bucketList = new ArrayList[bucketSize];

        // create 'buckets' within arraylist
        for (int i = 0; i < bucketList.length; i++) {
            bucketList[i] = new ArrayList<Integer>();
        }

        // begin sorting
        boolean max = false;
        int temp = 0;
        int divisor = 1;
        while (!max) {
            max = true;

            // split inputArray into list
            for (Integer i : inputArray) {
                temp = i / divisor;
                bucketList[temp % bucketSize].add(i);
                if (max && temp > 0) {
                    max = false;
                }
            }

            // move bucketList into inputArray
            int j = 0;
            for (int k = 0; k < bucketSize; k++) {
                for (Integer i : bucketList[k]) {
                    inputArray[j++] = i;
                }
                bucketList[k].clear();
            }

            // shift sort to next higher significant digit
            divisor *= bucketSize;
        }
        return inputArray;
    }
}
