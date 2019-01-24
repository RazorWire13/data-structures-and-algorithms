package hashtable;

public class Node {
    String key;
    String value;
    Node next;

    public Node(String key, String value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public Node(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

    public Node() {
        this.next = null;
    }
    public String getKey() {
        return this.key;
    }
    public void setKey(String newKey) { this.key = newKey; }

    public String getValue() {
        return this.value;
    }
    public void setValue(String newValue) { this.value = newValue; }

    public Node getNext() { return this.next; }
    public void setNext(Node newNext) { this.next = newNext; }

    public String toString() {
        return "Node key= " + key + "; val= " + value + ", next= " + next + "<";
    }
}
