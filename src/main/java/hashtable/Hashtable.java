package hashtable;

import java.util.LinkedList;

public class Hashtable {

    // Resourced from: - https://coderanch.com/t/667996/java/building-simple-hash-table-scratch

    // Set up size of hashtable node array
    protected int tableSize = 16;

    // Instantiate node array
    protected LinkedList<Node>[] hashTable = new LinkedList[tableSize];

    // returns the index of a passed in key
    public int getHash(String key) {

        // hashing function
        long index = 0;
        for (char character : key.toCharArray()) {
            index += (character);
        }

        // multiply by prime number for uniqueness and convert to an index value within the range of the array
        index += 137;
        index = index % hashTable.length;

        return (int) index;
    }

    // The 'add' function takes in a key/value string pair and adds it to the hashtable
    public Node add(String key, String value) {

        // Send the key to the GetHash method.
        int index = getHash(key);

        // Once you determine the index of where it should be placed, go to that index
        Node newHashNode = new Node(key, value);

        // Check if something exists at that index already, if it doesn’t, add it with the key/value pair.
        if (hashTable[index] == null) {
            hashTable[index] = new LinkedList<>();
        }
        hashTable[index].add(newHashNode);
        return newHashNode;
    }

    // The Contains method will accept a key, and return a bool on if that key exists inside the hashtable.
    public boolean contains(String key) {
        int index = getHash(key);
        if (hashTable[index] != null) {
            for (Node n : hashTable[index]) {
                if (hashTable[index].peek().key == key) {
                    return true;
                }
            }
        }
        return false;
    }

    // The Find takes in a key, gets the Hash, and goes to the index location specified.
    public String find(String key) {
        int index = getHash(key);
        if (hashTable[index] != null) {
            for (Node n : hashTable[index]) {
                if (hashTable[index].peek().key == key) {
                    return hashTable[index].peek().value;
                }
            }
        }
        return null;
    }

}
