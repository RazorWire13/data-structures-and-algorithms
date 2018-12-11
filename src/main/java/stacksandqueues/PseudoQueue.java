package stacksandqueues;

public class PseudoQueue<T> {

    public PseudoQueue() {
        this.stackOne = new Stack();
        this.stackTwo = new Stack();
    }

    Stack stackOne;
    Stack stackTwo;

    public static void main(String[] args) {
        PseudoQueue testQueue = new PseudoQueue();
        testQueue.enqueue(20);
        testQueue.enqueue(15);
        testQueue.enqueue(10);
        testQueue.enqueue(5);
        testQueue.dequeue();
    }

    // adds a value to the rear of the queue
    public void enqueue(T value) {
        stackOne.push(value);
    }

    // removes the front value of the queue and returns it
    public T dequeue() {
        while (stackOne.peek() != null) {
            stackTwo.push(stackOne.pop());
        }

        T value = (T)stackTwo.pop();

        while (stackTwo.peek() != null) {
            stackOne.push(stackTwo.pop());
        }
        System.out.println(value);
        return value;
    }
}
