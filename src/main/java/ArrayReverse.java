public class ArrayReverse {

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        //System.out.println(arr);
        reverseTheArray(arr);


        System.out.println(revArr);
    }

    public static int[] reverseTheArray(int[] arr) {
       int n = arr.length-1;
       int[] revArr = new int[arr.length];
       for (int i = 0; i < arr.length; i++) {
           revArr[n] = arr[i];
           n--;
       }
        return revArr;
    }

}
