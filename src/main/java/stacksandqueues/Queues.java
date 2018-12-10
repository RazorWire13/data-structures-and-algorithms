package stacksandqueues;

public class Queues {

    protected Node front;
    protected Node rear;

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
    public void enqueue(int value) {
        Node node = new Node(value);
        if (this.front == null) {
            this.front = node;
            this.rear = node;
        }
        rear.next = node;
        rear = node;
    }

    // dequeue removes the node from the front of the queue, and returns the node
    public int dequeue() {
        Node temp = this.front;
        this.front = this.front.next;
        temp.next = null;
        return temp.value;
    }

    // returns the node located in the front of the queue
    public int peek() {
        if (front != null) {
            return front.value;
        }
        return -1;
    }
}
