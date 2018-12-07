package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public static void main(String[] args) {
        LinkedList testLinkList = new LinkedList();
        testLinkList.insert(5);
        testLinkList.insert(3);
        testLinkList.insert(1);

        testLinkList.append(6);
        testLinkList.addBefore(3,2);
        testLinkList.addAfter(3,4);

        System.out.println("LL includes 3 = " + testLinkList.includes(3));
        System.out.println("LL includes 5 = " + testLinkList.includes(5));
        testLinkList.print();
        System.out.println(testLinkList.returnValueAtK(1));

        LinkedList testOne = new LinkedList();
        LinkedList testTwo = new LinkedList();
        testOne.insert(5);
        testOne.insert(3);
        testOne.insert(1);
        testTwo.insert(6);
        testTwo.insert(4);
        testTwo.insert(2);
        testOne.print();
        testTwo.print();
        mergeLists(testOne, testTwo).print();

    }

    protected Node head;
    protected Node current;
    protected Node leader;
    protected Node follow;

    public LinkedList() {
        this.head = null;
        this.current = null;
        this.leader = null;
        this.follow = null;
    }

    // inserts new node at the beginning of LL
    public void insert(int value) {
        head = new Node(value, head);
    }

    // checks to see if a specified value is in a LL
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

    // prints out a list of values in a LL
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

    // adds a new node to the end of a LL
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

    // adds a new node immediately before a specified existing node in a LL
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

    // adds a new node immediately after a specified existing node in a LL
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

    // returns the value of a node that is 'k' distance from the end of a LL
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

    // merges two lists by 'zippering' them together
    public static LinkedList mergeLists(LinkedList one, LinkedList two) {
        one.leader = one.head.next;
        one.follow = one.head;
        two.current = two.head;
        if(one.head == null) {
            return two;
        }
        if(two.head == null) {
            return one;
        }
        while (one.leader != null) {
            two.head = two.current.next;
            one.follow.next = two.current;
            two.current.next = one.leader;
            if (two.head == null) {
                return one;
            }
            two.current = two.head;
            one.follow = one.leader;
            one.leader = one.leader.next;
        }
        one.follow.next = two.current;
        one.print();
        return one;
    }
}
