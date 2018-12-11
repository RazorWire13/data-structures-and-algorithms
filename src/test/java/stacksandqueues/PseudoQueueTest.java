package stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueue() {
        PseudoQueue testQueue = new PseudoQueue();
            testQueue.enqueue(20);
            testQueue.enqueue(15);
            testQueue.enqueue(10);
            testQueue.enqueue(5);
            assertNotNull("testQueue has objects", testQueue);
    }

    @Test
    public void dequeue() {
        PseudoQueue testQueue = new PseudoQueue();
            testQueue.enqueue(20);
            testQueue.enqueue(15);
            testQueue.enqueue(10);
            testQueue.enqueue(5);
            assertEquals("value of dequeue should be 20", 20, testQueue.dequeue());
            assertNotEquals("value of dequeue should not be 5", 5, testQueue.dequeue());
    }
}