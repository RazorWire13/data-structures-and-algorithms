package tree;

public class TreeNode<T> {
    public T value;
    public TreeNode<T> left;
    public TreeNode<T> right;


    public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    //Creates a leaf node if just a value is passed in.
    public TreeNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public String toString() {
        return this.value.toString();
    }
}
