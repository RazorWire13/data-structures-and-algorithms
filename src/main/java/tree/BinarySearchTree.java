package tree;

public class BinarySearchTree extends BinaryTree {

    public static void main(String[] args) {
        BinaryTree testTree = new BinaryTree();
        testTree.add(3);
    }

    protected Node root;
    protected Node current;

    public BinarySearchTree() {
        this.root = null;
        this.current = null;
    }

    public Node addLeaf(Node current, int value) {
            // check if tree is empty
        if (current == null) {
            return new Node (value);
        }
            // compares passed value to current and if less then adds to LEFT
        if (value < current.value) {
            current.left = addLeaf(current.left, value);

            // compares passed value to current and if less then adds to RIGHT
        } else if (value < current.value) {
            current.right = addLeaf(current.right, value);

            // if the node value already exists in the list return current node
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addLeaf(root, value);
    }
}
