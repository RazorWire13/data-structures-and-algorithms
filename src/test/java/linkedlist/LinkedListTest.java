package linkedlist;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insert() {
        LinkedList testLinkList = new LinkedList();
        testLinkList.insert(1);
        assertNotNull("insert should create a node");

    }

    @Test
    public void includes() {
        LinkedList testLinkList = new LinkedList();
            testLinkList.insert(2);
        assertFalse("includes should return 'false' when a value doesn't exist", testLinkList.includes(10));
        assertTrue("includes should return 'true' when a value exists", testLinkList.includes(2));    }

    @Test
    public void print() {
        LinkedList testLinkList = new LinkedList();
            testLinkList.insert(5);
            testLinkList.insert(4);
            testLinkList.insert(3);

        ArrayList<Integer> testArray = new ArrayList<>();
            testArray.add(3);
            testArray.add(4);
            testArray.add(5);
        assertEquals("print returns an ArrayList containing the inserted values", testArray, testLinkList.print());
    }
}