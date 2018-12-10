package stacksandqueues;

public class Stack {

    public static void main(String[] args) {

    }

    protected Node top;

    public Stack() {
        this.top = null;
    }

    // push takes any value as an argument and adds a new node with that value to the top of the stack
    public void push(int value) { top = new Node(value, top); }

    public void pop() {
        
    }

}
