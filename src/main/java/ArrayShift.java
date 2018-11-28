import java.lang.Math;
import java.util.ArrayList;

public class ArrayShift {

    public static void main(String[] args) {

        ArrayList<Integer> arrList = new ArrayList();
        arrList.add(2);
        arrList.add(4);
        arrList.add(6);
        arrList.add(8);
        arrList.add(10);
        arrList.add(12);
        int val = 100;
        insertShiftArray(arrList, val);
        System.out.println("The modified array with the value added now looks like this " + arrList);
    }

    public static ArrayList<Integer> insertShiftArray(ArrayList arrList, int val) {

        System.out.println("The initial array contains " + arrList);
        int listSize = arrList.size();
        int mid = (int)Math.floor(listSize / 2);
        System.out.println("The length of the array is " + listSize);
        System.out.println("The midpoint of the array is at position " + mid);
        arrList.add(mid, val);
        return (arrList);

    }

}
