package stacksandqueues;

public class Queues<T> {

    protected Node<T> front;
    protected Node<T> rear;

    public static void main(String[] args) {
        Queues queue = new Queues();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.peek());

    }

    public Queues() {
        this.front = null;
        this.rear = null;
    }

    // enqueue takes a value as an argument and adds a new node with that value to the back of the queue
    public void enqueue(T value) {
        Node<T> node = new Node(value);
        if (this.front == null) {
            this.front = node;
            this.rear = node;
        } else {
            this.rear.next = node;
            this.rear = node;
        }
    }

    // dequeue removes the node from the front of the queue, and returns the node
    public T dequeue() {
        if (this.front == null) {
            return null;
        }
        Node<T> temp = this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        temp.next = null;
        return temp.value;
    }

    // returns the node located in the front of the queue
    public T peek() {
        if (this.front != null) {
            return this.front.value;
        }
        return null;
    }
}
