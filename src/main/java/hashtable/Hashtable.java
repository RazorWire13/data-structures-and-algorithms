package hashtable;

public class Hashtable {

    public static void main(String[] args) {
        Hashtable testTable = new Hashtable();
        System.out.println(testTable.getHash("hello"));
    }

    // Resourced from: - https://coderanch.com/t/667996/java/building-simple-hash-table-scratch

    // Set up size of hashtable node array
    protected int tableSize = 16;

    // Instantiate node array
    protected Node[] hashTable = new Node[tableSize];

    // returns the index of a passed in key
    public int getHash(String key) {
        Object hashKey = key;
        int index = Math.abs(hashKey.hashCode() % tableSize);
        return index;
    }

    //    When adding a new key/value pair to a hashtable:
    public void add(String key, String value) {

        // Send the key to the GetHash method.
        int index = getHash(key);

        // Once you determine the index of where it should be placed, go to that index
        Node newHashNode = new Node(key, value);

        // Check if something exists at that index already, if it doesn’t, add it with the key/value pair.
        if (hashTable[index] == null) {
            hashTable[index] = newHashNode;
        } else {

            // If something does exist, add the new key/value pair to the data structure within that bucket.
            Node nodeToAdd = hashTable[index];
            while (nodeToAdd.next != null) {
                nodeToAdd = nodeToAdd.next;
            }
            nodeToAdd.next = newHashNode;
        }
    }

    public boolean contains(String key) {

        // The Contains method will accept a key, and return a bool on if that key exists inside the hashtable.
        // The best way to do this is to have the contains call the GetHash and check the hashtable if the key exists in the table given the index returned.
    }

    public String find(String key) {
        int index = getHash(key);
    // The Find takes in a key, gets the Hash, and goes to the index location specified.


    // Once the index location is found in the array, it is then the responsibility of the algorithm the iterate through the bucket and see if the key exists and return the value.

    }
}
