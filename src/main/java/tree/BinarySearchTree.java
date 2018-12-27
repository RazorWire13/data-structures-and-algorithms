package tree;

public class BinarySearchTree extends BinaryTree {

    public static void main(String[] args) {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.root = new TreeNode(100,
                new TreeNode(50,
                        new TreeNode(25, null, null),
                        new TreeNode(75, null, null)),
                new TreeNode(150,
                        new TreeNode(125, null, null),
                        new TreeNode(175, null, null)));

        System.out.println(testTree.contains(25));
    }

    public BinarySearchTree() {
        super();
    }


    // needed some baeldung love to get through this

    public void add(Integer value) {
        if (this.root == null) {
            this.root = new TreeNode<>(value);
        } else {
            addHelper(root, value);
        }
    }
    public TreeNode addHelper(TreeNode<Integer> node, Integer value) {
        if (node == null) {
            return new TreeNode<>(value, null, null);
        }
        if (value < node.value) {
            node.left = addHelper(node.left, value);

        } else if (value > node.value) {
            node.right = addHelper(node.right, value);
        } else {
            return node;
        }
        return node;
    }
public boolean contains(Integer value) {
        return containsHelper(value, root);
}

    public boolean containsHelper(Integer value, TreeNode<Integer> node) {
        if (node == null) {
            return false;
        }
        if (value == node.value) {
            return true;
        }
        return value < node.value ? containsHelper(value, node.left) : containsHelper(value, node.right);
     }
}

