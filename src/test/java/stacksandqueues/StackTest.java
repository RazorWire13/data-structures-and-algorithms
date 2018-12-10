package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void testPush() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertNotNull("queue is not null", stack);
        assertEquals("the top value of the queue is 3", 3, stack.top.value);
    }

    @Test
    public void testPop() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        assertNotNull("queue is not null", stack);
        assertEquals("the top value of the queue is 2", 2, stack.top.value);
        assertEquals("the popped value equals 2", 2, stack.pop());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertNotNull("queue is not null", stack);
        assertEquals("the top value of the queue is 3", 3, stack.peek());
    }
}