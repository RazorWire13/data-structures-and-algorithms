package linkedlist;

import java.util.*;

public class LinkedList {

    public static void main(String[] args) {
        LinkedList testLinkList = new LinkedList();
        testLinkList.insert(2);
        testLinkList.insert(3);
        testLinkList.insert(1);
        testLinkList.append(5);
        testLinkList.print();
    }

    protected Node head;
    protected Node current;

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
            System.out.println(current.value + " ");
            current = current.next;
        }
        return nodeValues;
    }

    public void append(int value) {
        current = head;
        while (current != null) {
            current = current.next;
        }
        current = new Node(value, null);
        System.out.println(current);
    }

    public void addBefore(int value, int newValue) {
        while (current != null) {
            if (current.next.value == value) {
                current = new Node (newValue, current.next);
            }
            current = current.next;
        }
        System.out.println(current);
    }

    public void addAfter(int value, int newValue ) {
        while (current != null) {
            if (current.value == value) {
                current.next = new Node (newValue, current.next);
            }
            current = current.next;
        }
        System.out.println(current.next);
    }
}
