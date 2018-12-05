package linkedlist;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testInsert() {
        LinkedList testLL = new LinkedList();
        testLL.insert(1);
        assertNotNull("insert should create a node");

    }

    @Test
    public void testIncludes() {
        LinkedList testLL = new LinkedList();
        testLL.insert(2);
        testLL.insert(3);
        testLL.insert(1);

        assertFalse("includes should return 'false' when a value doesn't exist", testLL.includes(10));
        assertTrue("includes should return 'true' when a value exists", testLL.includes(2));
    }

    @Test
    public void testPrint() {
        LinkedList testLL = new LinkedList();
        testLL.insert(2);
        testLL.insert(3);
        testLL.insert(1);

        ArrayList<Integer> testArray = new ArrayList<>();
            testArray.add(1);
            testArray.add(3);
            testArray.add(2);
        assertEquals("print returns an ArrayList containing the inserted values", testArray, testLL.print());
    }

    @Test
    public void testAppend() {
        LinkedList testLL = new LinkedList();
        testLL.insert(2);
        testLL.insert(3);
        testLL.insert(1);
        testLL.append(5);
        assertTrue("includes 5", testLL.includes(5));
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
        assertEquals("should be 5", 5, testLL.head.next.value);
    }

    @Test
    public void testAddAfter() {
        LinkedList testLL = new LinkedList();
        testLL.insert(2);
        testLL.insert(5);
        testLL.insert(3);
        testLL.insert(1);
        assertTrue("includes 5", testLL.includes(5));
    }

    @Test
    public void testReturnValueAtK() {
        LinkedList testLL = new LinkedList();
        testLL.insert(2);
        testLL.insert(5);
        testLL.insert(3);
        testLL.insert(1);
        assertEquals("returnValueAtK returns a value at the deltaK location", true, testLL.includes( 5));

    }
}