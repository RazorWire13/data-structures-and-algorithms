package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void getHash() {
        Hashtable testTable = new Hashtable();
        assertEquals("getHash should return expected index for key", 2, testTable.getHash("hello"));
        assertNotEquals("getHash should return expected index for key", 3, testTable.getHash("hello"));
        assertEquals("getHash should return expected index for key", 0, testTable.getHash("0"));
    }

    @Test
    public void add() {
        Hashtable testTable = new Hashtable();
        testTable.add("42","Dave");
        String expectedKey = "42";
//        assertEquals("index 14 equals key 42", expectedKey, testTable[14].getKey);
    }

    @Test
    public void contains() {
        Hashtable testTable = new Hashtable();
        testTable.add("42","Dave");
        assertTrue("testTable contains key 42", testTable.contains("42"));
    }

    @Test
    public void find() {
        Hashtable testTable = new Hashtable();
        testTable.add("42","Dave");
        assertEquals("testTable contains key 42", "Dave",testTable.find("42"));
        assertNull(testTable.find("10"));
        assertNotNull(testTable.find("42"));
    }
}