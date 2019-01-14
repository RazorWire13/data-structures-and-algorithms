package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void getHash() {
        Hashtable testTable = new Hashtable();
        int expected = 2;
        assertEquals("getHash should return expected index for key", expected, testTable.getHash("hello"));
    }

    @Test
    public void add() {
        Hashtable testTable = new Hashtable();
        testTable.add("24","Dave");
    }
}