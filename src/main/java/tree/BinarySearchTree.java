package tree;

public class BinarySearchTree<T> extends BinaryTree {

//    public static void main(String[] args) {
//        BinaryTree<String> testTree = new BinaryTree<>();
//        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
//
//    }
//
//    protected TreeNode root;
//    protected TreeNode current;
//
//    //
//    public void add(int value) {
//        root = addRecursive(root, value);
//    }
//
//    public TreeNode addRecursive(TreeNode current, int value) {
//            // check if tree is empty
//        if (current == null) {
//            return new TreeNode(value);
//        }
//            // compares passed value to current and if less then adds to LEFT
//        if (value < current.value) {
//            current.left = addRecursive(current.left, value);
//
//            // compares passed value to current and if less then adds to RIGHT
//        } else if (value < current.value) {
//            current.right = addRecursive(current.right, value);
//
//            // if the node value already exists in the list return current node
//        } else {
//            return current;
//        }
//        return current;
//    }

}
