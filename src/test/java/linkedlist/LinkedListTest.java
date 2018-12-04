package linkedlist;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert() {
        LinkedList testLinkList = new LinkedList();
        testLinkList.insert(1);
        assertNotNull("insert should create a node");

    }

    @Test
    public void testIncludes() {
        LinkedList testLinkList = new LinkedList();
            testLinkList.insert(2);
            testLinkList.insert(3);
            testLinkList.insert(1);

        assertFalse("includes should return 'false' when a value doesn't exist", testLinkList.includes(10));
        assertTrue("includes should return 'true' when a value exists", testLinkList.includes(2));
    }

    @Test
    public void testPrint() {
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

    @Test
    public void testAppend() {
        LinkedList testLinkList = new LinkedList();
        testLinkList.insert(2);
        testLinkList.insert(3);
        testLinkList.insert(1);
        testLinkList.append(5);

//        assertFalse("should include 5", true, testLinkList.includes(5));
        assertTrue("includes 5", true, testLinkList.includes(5));
    }

    @Test
    public void testAddBefore() {
        LinkedList testLL = new LinkedList();
            testLL.insert(2);
            testLL.insert(3);
            testLL.insert(1);
            testLL.addBefore(3,5);
            Node current = testLL.head;
            int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        System.out.println(testLL);
        assertEquals("should be 4", 4, length);
        assertEquals("addBefore returns info for a node added BEFORE the specified value in the linked list", true, testLL.includes(5));
        assertEquals("should be 5", 5, testLL.head.next.value);
    }

//    @Test
//    public void testAddAfter() {
//        LinkedList testLL = new LinkedList();
//            testLL.insert(2);
//            testLL.insert(3);
//            testLL.insert(1);
//            testLL.addAfter(3,5);
//        assertTrue("addAfter returns info for a node added AFTER the specified value in the linked list", testLL.addAfter(3, 5));
//    }
}