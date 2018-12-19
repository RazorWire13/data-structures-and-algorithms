package tree;

import stacksandqueues.Queues;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree<T> {

    TreeNode<T> root;

    public static void main(String[] args) {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));

        System.out.println(Arrays.toString(testTree.preOrder()));
        System.out.println(Arrays.toString(testTree.inOrder()));
        System.out.println(Arrays.toString(testTree.postOrder()));
        testTree.breadthFirst(testTree.root);

    }

    public Object[] preOrder() {
        return BinaryTree.preOrderHelper(this.root).toArray();
    }

    private static ArrayList<TreeNode> preOrderHelper(TreeNode root) {
        if (root == null) {
            return new ArrayList<TreeNode>();
        } else {
            ArrayList<TreeNode> left = preOrderHelper(root.left);
            ArrayList<TreeNode> right = preOrderHelper(root.right);
            left.add(0, root);
            left.addAll(right);
            return left;
        }
    }

    public Object[] inOrder() {
        return BinaryTree.inOrderHelper(this.root).toArray();
    }

    private static ArrayList<TreeNode> inOrderHelper(TreeNode root) {
        if (root == null) {
            return new ArrayList<TreeNode>();
        } else {
            ArrayList<TreeNode> left = inOrderHelper(root.left);
            ArrayList<TreeNode> right = inOrderHelper(root.right);
            left.add(root);
            left.addAll(right);
            return left;
        }
    }

    public Object[] postOrder() {
        return BinaryTree.postOrderHelper(this.root).toArray();
    }

    private static ArrayList<TreeNode> postOrderHelper(TreeNode root) {
        if (root == null) {
            return new ArrayList<TreeNode>();
        } else {
            ArrayList<TreeNode> left = postOrderHelper(root.left);
            ArrayList<TreeNode> right = postOrderHelper(root.right);
            left.addAll(right);
            left.add(root);
            return left;
        }
    }

    public void breadthFirst(TreeNode<T> node) {
        if (node == null) {
            System.out.println("Null root");
        }
        Queues<TreeNode> queue = new Queues<>();
        queue.enqueue(node);
        while (queue.peek() != null) {
            TreeNode<T> front = queue.dequeue();
            System.out.println(front.value);
            if (front.left != null) queue.enqueue(front.left);
            if (front.right != null) queue.enqueue(front.right);
        }
    }

    public String toString() {
        return this.root.toString();
    }
}