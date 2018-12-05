package linkedlist;

import java.util.*;

public class LinkedList {

    public static void main(String[] args) {
        LinkedList testLinkList = new LinkedList();
        testLinkList.insert(2);
        testLinkList.insert(3);
        testLinkList.insert(1);
//        testLinkList.append(5);

//        testLinkList.addBefore(3,5);
        testLinkList.addAfter(3,5);


        System.out.println("LL includes 3 = " + testLinkList.includes(3));
        System.out.println("LL includes 5 = " + testLinkList.includes(5));
        testLinkList.print();
        System.out.println(testLinkList.returnValueAtK(1));
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
            current = current.next;
        }
        System.out.println("The current values in the LL are: " + nodeValues);
        return nodeValues;
    }

    public void append(int newNodeValue) {
        current = head;
        while (current != null) {
            if (current.next == null) {
                Node newNode = new Node (newNodeValue, current.next);
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void addBefore(int targetValue, int newNodeValue) {
        current = head;
        while (current != null) {
            if (current.next.value == targetValue) {
                Node newNode = new Node (newNodeValue, current.next);
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public void addAfter(int targetValue, int newNodeValue) {
        current = head;
        while (current != null) {
            if (current.value == targetValue) {
                Node newNode = new Node (newNodeValue, current.next);
                current.next = newNode;
                break;
            }
            current = current.next;
        }
    }

    public int returnValueAtK(int valueK) {
        int sizeCount = 0;
        current = head;
        while (current != null) {
            sizeCount++;
            current = current.next;
        }
        if (valueK > sizeCount) {
            return -1;
        }
        if (valueK < 0) {
            return -1;
        }
        int deltaK = sizeCount - valueK;
        current = head;
        for (int i = 0; i < deltaK; i++) {
            if (i == deltaK-1) {
                return current.value;
            }
            current = current.next;
        }
        return -1;
    }
}
