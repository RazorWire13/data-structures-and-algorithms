import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void binarySearchTest_keyPosition() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals("binarySearch should return a position value of the key that is passed into the method", 7, BinarySearch.binarySearch(array, 8));
    }

    @Test
    public void binarySearchTest_noJoy() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals("binarySearch should return '-1' if the key that is passed into the method does not exist in the array", -1, BinarySearch.binarySearch(array, 10));
    }

}
