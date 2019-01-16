package tree;

import stacksandqueues.Queues;

import java.util.ArrayList;

public class BinaryTree<T> {

    public TreeNode<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public static void main(String[] args) {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a",
                new TreeNode("b",
                        new TreeNode("d"),
                        new TreeNode("e")),
                new TreeNode("c",
                        new TreeNode("f"),
                        new TreeNode("g")));

        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(8,
                new TreeNode(2,
                        new TreeNode(6),
                        new TreeNode(15)),
                new TreeNode(4,
                        new TreeNode(21),
                        new TreeNode(9)));

        System.out.println(preOrder(testTree.root));
        System.out.println(inOrder(testTree.root));
        System.out.println(postOrder(testTree.root));

        testTree.breadthFirst(testTree.root);
        System.out.println(findMaxValue(maxTree));
        ArrayList<TreeNode> a = preOrder(testTree.root);
        System.out.println(a.get(0).value);
    }

    // PRE ORDER TRAVERSAL
    public static ArrayList<TreeNode> preOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<TreeNode>();
        } else {
            ArrayList<TreeNode> left = preOrder(root.left);
            ArrayList<TreeNode> right = preOrder(root.right);
            left.add(0, root);
            left.addAll(right);
            return left;
        }
    }

    // IN ORDER TRAVERSAL
    public static ArrayList<TreeNode> inOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<TreeNode>();
        } else {
            ArrayList<TreeNode> left = inOrder(root.left);
            ArrayList<TreeNode> right = inOrder(root.right);
            left.add(root);
            left.addAll(right);
            return left;
        }
    }

    // POST ORDER TRAVERSAL
    public static ArrayList<TreeNode> postOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<TreeNode>();
        } else {
            ArrayList<TreeNode> left = postOrder(root.left);
            ArrayList<TreeNode> right = postOrder(root.right);
            left.addAll(right);
            left.add(root);
            return left;
        }
    }

    // BREADTH FIRST TRAVERSAL
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

    // FIND MAX VALUE
    public static int findMaxValue(BinaryTree tree) throws IllegalStateException {
        if(tree.root == null) {
            throw new IllegalStateException();
        }
        return findMaxHelper(tree.root);
    }

    private static int findMaxHelper(TreeNode root) {
        int max = (int)root.value;
        if(root.left != null) {
            max = max(max, findMaxHelper(root.left));
        }
        if(root.right != null) {
            max = max(max, findMaxHelper(root.right));
        }
        return max;
    }

    private static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public String toString() {
        return this.root.toString();
    }
}