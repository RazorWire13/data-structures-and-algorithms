package tree;

public class BinarySearchTree<T> extends BinaryTree {

    public static void main(String[] args) {
        BinaryTree testTree = new BinaryTree();

    }

    protected Node<T> root;
    protected Node<T> current;

    //
    public void add(int value) {
        root = addRecursive(root, value);
    }

    public Node addRecursive(Node current, int value) {
            // check if tree is empty
        if (current == null) {
            return new Node (value);
        }
            // compares passed value to current and if less then adds to LEFT
        if (value < current.value) {
            current.left = addRecursive(current.left, value);

            // compares passed value to current and if less then adds to RIGHT
        } else if (value < current.value) {
            current.right = addRecursive(current.right, value);

            // if the node value already exists in the list return current node
        } else {
            return current;
        }
        return current;
    }

}
