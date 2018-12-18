package tree;

import java.util.*;

public class BinaryTree<T> {

    Node<T> root;

    public static void main(String[] args) {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new Node("a", new Node("b", new Node("d", null, null), new Node("e", null, null)), new Node("c", new Node("f", null, null), new Node("g", null, null)));

        System.out.println(Arrays.toString(testTree.preOrder()));
        System.out.println(Arrays.toString(testTree.inOrder()));
        System.out.println(Arrays.toString(testTree.postOrder()));

    }

    public Object[] preOrder() {
        return BinaryTree.preOrderHelper(this.root).toArray();
    }

    private static ArrayList<Node> preOrderHelper(Node root) {
        if (root == null) {
            return new ArrayList<Node>();
        } else {
            ArrayList<Node> left = preOrderHelper(root.left);
            ArrayList<Node> right = preOrderHelper(root.right);
            left.add(0, root);
            left.addAll(right);
            return left;
        }
    }

    public Object[] inOrder() {
        return BinaryTree.inOrderHelper(this.root).toArray();
    }

    private static ArrayList<Node> inOrderHelper(Node root) {
        if (root == null) {
            return new ArrayList<Node>();
        } else {
            ArrayList<Node> left = inOrderHelper(root.left);
            ArrayList<Node> right = inOrderHelper(root.right);
            left.add(root);
            left.addAll(right);
            return left;
        }
    }

    public Object[] postOrder() {
        return BinaryTree.postOrderHelper(this.root).toArray();
    }

    private static ArrayList<Node> postOrderHelper(Node root) {
        if (root == null) {
            return new ArrayList<Node>();
        } else {
            ArrayList<Node> left = postOrderHelper(root.left);
            ArrayList<Node> right = postOrderHelper(root.right);
            left.addAll(right);
            left.add(root);
            return left;
        }
    }

    public String toString() {
        return this.root.toString();
    }
}