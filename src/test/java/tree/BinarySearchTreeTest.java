package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void addTest() {
        BinarySearchTree testAddTree = new BinarySearchTree();
        testAddTree.add(100);
        testAddTree.add(50);
        testAddTree.add(150);
        testAddTree.add(25);
        testAddTree.add(75);
        testAddTree.add(125);
        testAddTree.add(175);
        assertEquals("root value equals 100", 100, testAddTree.root.value);
        assertEquals("root.left value equals 50", 50, testAddTree.root.left.value);
        assertEquals("root.right value equals 150", 150, testAddTree.root.right.value);
        assertEquals("root.left.left value equals 100", 25, testAddTree.root.left.left.value);
        assertEquals("root.left.right value equals 50", 75, testAddTree.root.left.right.value);
        assertEquals("root.right.left value equals 125", 125, testAddTree.root.right.left.value);
        assertEquals("root.right.right value equals 175", 175, testAddTree.root.right.right.value);
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