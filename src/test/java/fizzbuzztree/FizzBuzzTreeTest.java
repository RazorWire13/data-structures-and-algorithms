package fizzbuzztree;

import org.junit.Test;
import tree.BinaryTree;
import tree.TreeNode;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest {

    @Test
    public void fizzBuzzTreeTest() {
        BinaryTree<Object> testTree = new BinaryTree<>()
;
        testTree.root = new TreeNode(15,
                new TreeNode(5,
                        new TreeNode(2),
                        new TreeNode(1)),
                new TreeNode(3,
                        new TreeNode(30),
                        new TreeNode(-1)));
        FizzBuzzTree.fizzBuzzTree(testTree);
        assertEquals("The root value should now be FizzBuzz", "FizzBuzz", testTree.root.value);
        assertEquals("The root.left value should now be Buzz", "Buzz", testTree.root.left.value);
        assertEquals("The root.right value should now be Fizz", "Fizz", testTree.root.right.value);
        assertEquals("The root.left.left value should be 2", 2, testTree. root.left.left.value);
        assertEquals("The root.right.right value should be -1", -1, testTree. root.right.right.value);
        assertEquals("The root.right.left value should be FizzBuzz", "FizzBuzz", testTree. root.right.left.value);

    }

}