package linkedlist;

import java.util.*;

public class LinkedList {

    public static void main(String[] args) {
        LinkedList testLinkList = new LinkedList();
        testLinkList.insert(2);
        testLinkList.insert(3);
        testLinkList.insert(1);

        testLinkList.addBefore(3,5);

        System.out.println("LL includes 3 = " + testLinkList.includes(3));
        System.out.println("LL includes 5 = " + testLinkList.includes(5));
//        testLinkList.append(5);
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
        Node prevNode = current;
        ArrayList<Integer> nodeValues = new ArrayList<>();
        ArrayList<Integer> prevNodeValues = new ArrayList<>();

        while (current != null) {
            nodeValues.add(current.value);
            prevNodeValues.add(current.value);
            prevNode = current;
            current = current.next;
            System.out.println(prevNode);

        }
        System.out.println("The current values in the LL are: " + nodeValues);
        System.out.println("The previous values in the LL are: " + prevNodeValues);

        return nodeValues;
    }

    public void append(int newNodeValue) {
        current = head;
        Node prevNode = current;
        while (current != null) {

            current = current.next;
            if (current.next == null) {
                current = new Node(newNodeValue, null);
            }
        }
    }

    public void addBefore(int targetValue, int newNodeValue) {
        current = head;
        while (current.next != null) {
            if (current.next.value == targetValue) {
                current = new Node (newNodeValue, current.next);
            }
            current = current.next;
        }
    }

    public void addAfter(int targetValue, int newNodeValue) {
        while (current.next != null) {
            if (current.value == targetValue) {
                current.next = new Node (newNodeValue, current.next);
            }
            current = current.next;
        }
    }
}
