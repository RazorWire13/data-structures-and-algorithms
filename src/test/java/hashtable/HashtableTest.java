package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void getHash_Tests() {
        Hashtable testTable = new Hashtable();
        assertEquals("getHash should return expected index for key", 2, testTable.getHash("hello"));
        assertNotEquals("getHash should return expected index for key", 3, testTable.getHash("hello"));
        assertEquals("getHash should return expected index for key", 0, testTable.getHash("0"));
    }

    @Test
    public void add_Tests() {
        Hashtable testTable = new Hashtable();
        testTable.add("1","A Bucket");
        testTable.add("2","B Bucket");
        testTable.add("3","C Bucket");
        testTable.add("4","D Bucket");
        testTable.add("5","E Bucket");
        testTable.add("6","F Bucket");
        testTable.add("7","G Bucket");

        String expectedKey = "42";
//        assertEquals("index 14 equals key 42", expectedKey, testTable[14].contains("42"));
    }

    @Test
    public void contains_Tests() {
        Hashtable testTable = new Hashtable();
        testTable.add("42","Dave");
        assertTrue("testTable contains key 42", testTable.contains("42"));
    }

    @Test
    public void find_Tests() {
        Hashtable testTable = new Hashtable();
        testTable.add("42","Dave");
        assertEquals("testTable contains key 42", "Dave",testTable.find("42"));
        assertNull(testTable.find("10"));
        assertNotNull(testTable.find("42"));
    }
}