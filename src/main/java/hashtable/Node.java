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
        return key;
    }

    public String getValue() {
        return value;
    }

    public String toString() {
        return "Node key= " + key + "; val= " + value + ", next= " + next + "<";
    }
}
