package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void addTest() {
    }

    @Test
    public void containsTest() {
        BinarySearchTree testTree = new BinarySearchTree();
        testTree.root = new TreeNode(100,
                new TreeNode(50,
                        new TreeNode(25, null, null),
                        new TreeNode(75, null, null)),
                new TreeNode(150,
                        new TreeNode(125, null, null),
                        new TreeNode(175, null, null)));
            assertTrue(testTree.contains(100));
            assertTrue(testTree.contains(50));
            assertFalse(testTree.contains(1));
        }
}