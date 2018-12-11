package stacksandqueues;

public class Stack<T> {

    protected Node<T> top;

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }

    public Stack() {
        this.top = null;
    }

    // push takes any value as an argument and adds a new node with that value to the top of the stack
    public void push(T value) {
        Node<T> node = new Node(value);
        node.next = this.top;
        this.top = node;
    }

    // pop removes the node from the top of the stack, and returns the value of the node
    public T pop() {
        Node<T> temp = this.top;
        this.top = this.top.next;
        temp.next = null;
        return temp.value;
    }

    // peek returns the node located on the top of the stack.
    public T peek() {
        if (this.top != null) {
            return this.top.value;
        }
        return null;
    }


}
