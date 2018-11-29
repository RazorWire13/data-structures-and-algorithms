import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*

public class ArrayShiftTest {

    @Test
    public static arrayShiftTest() {
        ArrayList<Integer> testedArray = { 1, 3, 5, 7 };
        assertArrayEquals(testedArray.size + 1, ArrayShift.insertShiftArray(testedArray, 100).size);

    }
}

// message, expected value, test value