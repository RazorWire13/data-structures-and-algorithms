import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = { 89, 2354, 3546, 23, 10, -923, 823, -12 };
        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
    }

    public static int[] reverseArray(int[] arr) {
       int n = arr.length-1;
       int[] revArr = new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
           revArr[n] = arr[i];
           n--;
       }
        System.out.println(Arrays.toString(revArr));
        return revArr;
    }
}
