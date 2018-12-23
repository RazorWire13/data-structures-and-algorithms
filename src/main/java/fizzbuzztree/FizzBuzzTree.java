package fizzbuzztree;

import tree.BinaryTree;
import tree.TreeNode;

public class FizzBuzzTree {

    public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> tree) {
        fizzBuzzSearch(tree.root);
            return tree;
    }

    public static void fizzBuzzSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            fizzBuzzSearch(root.left);
        }
        if (root.right != null) {
            fizzBuzzSearch(root.right);
        }

        if ((int) root.value % 5 == 0) {
            if ((int) root.value % 3 == 0) {
            root.value = "FizzBuzz";
        } else {
                root.value = "Buzz";
            }
        } else if ((int)root.value % 3 == 0) {
            root.value = "Fizz";
        }
    }
}
