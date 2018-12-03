package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    private Node head;

    private Node current;

    public LinkedList() {
        this.head = null;
        this.current = null;
    }

    public void insert(int value) {
        head = new Node(value, head);
    }

    public boolean includes(int value) {
        current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public List<Integer> print() {
        current = head;
        ArrayList<Integer> nodeValues = new ArrayList<>();
        while (current != null) {
            nodeValues.add(current.value);
            System.out.println(current.value);
            current = current.next;
        }
        return nodeValues;
    }
}
