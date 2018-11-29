import java.lang.Math;

public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 8;
        int joy = binarySearch(sortedArray, key);
//        System.out.println(binarySearch(sortedArray, key));
        System.out.println("The key is at position " + joy);
    }

    public static int binarySearch(int[] sortedArray, int key) {
        int rightArr = sortedArray.length - 1;
        int leftArr = 0;

        while (leftArr <= rightArr) {
            int mid = (int) Math.floor((leftArr + rightArr) / 2);
            if (sortedArray[mid] < key) {
                leftArr = mid + 1;
                System.out.println(leftArr);

            } else {
                if (sortedArray[mid] > key) {
                    rightArr = mid - 1;
                    System.out.println(rightArr);


                } else {
                    return mid;
                }

            }

        }
        return -1;
    }

}
