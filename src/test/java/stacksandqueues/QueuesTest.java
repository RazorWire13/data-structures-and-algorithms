package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueuesTest {

    @Test
    public void testEnqueue() {
        Queues queue = new Queues();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertNotNull("queue is not null", queue);
        assertEquals("the front value of the queue is 1", 1, queue.front.value);
        assertEquals("the rear value of the queue is 3", 3, queue.rear.value);

    }

    @Test
    public void testDequeue() {
        Queues queue = new Queues();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.dequeue();
        assertNotNull("queue is not null", queue);
        assertEquals("the front value of the queue is 2", 2, queue.front.value);
        assertEquals("the rear value of the queue is 3", 3, queue.rear.value);
    }

    @Test
    public void testPeek() {
        Queues queue = new Queues();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        assertNotNull("queue is not null", queue);
        assertEquals("the front value of the queue is 1", 1, queue.peek());
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        assertEquals("the value of the queue is -1", -1, queue.peek());
    }
}