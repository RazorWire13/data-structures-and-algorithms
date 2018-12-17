package tree;

public class BinaryTree {

    public static void main(String[] args) {
        BinaryTree testTree = new BinaryTree();

    }

    protected Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void preOrder(Node root) {
        System.out.println(root.value);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root) {
        inOrder(root.left);
        System.out.println(root.value);
        inOrder(root.right);
    }

    public void postOrder(Node root) {
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.value);
    }

}
