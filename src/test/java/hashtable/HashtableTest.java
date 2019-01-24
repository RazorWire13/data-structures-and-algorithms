package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void getHash_Tests() {
        Hashtable testTable = new Hashtable();
        assertEquals("getHash should return expected index for key", 13, testTable.getHash("hello"));

        assertNotEquals("getHash should return expected index for key", 3, testTable.getHash("hello"));

        assertEquals("getHash should return expected index for key", 9, testTable.getHash("0"));
    }

    @Test
    public void add_Tests() {
        Hashtable testTable = new Hashtable();
        Node nodeA = testTable.add("42", "Dave");
        Node nodeB = testTable.add("13", "Joker");
        Node nodeC = testTable.add("7", "Lucky");

        String expectedKeyA = "42";
        String expectedValueB = "Joker";

        assertEquals("Return expected Key", expectedKeyA, nodeA.key);
        assertEquals("Return expected Value", expectedValueB, nodeB.value);
        assertTrue("Node contained in linked list", testTable.contains("7"));
    }

    @Test
    public void contains_Tests() {
        Hashtable testTable = new Hashtable();
        testTable.add("42", "Dave");
        testTable.add("Joker", "13");

        assertTrue("testTable contains key 42", testTable.contains("42"));
        assertTrue("testTable contains key Joker", testTable.contains("Joker"));
        assertFalse("testTable does not contain key 13", testTable.contains("13"));
        assertFalse("testTable does not contain key Dave", testTable.contains("Dave"));
    }

    @Test
    public void find_Tests() {
        Hashtable testTable = new Hashtable();
        testTable.add("42", "Dave");
        assertEquals("testTable contains key 42", "Dave", testTable.find("42"));
        assertNull(testTable.find("10"));
        assertNotNull(testTable.find("42"));
    }
}