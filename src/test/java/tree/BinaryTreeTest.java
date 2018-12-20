package tree;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static tree.BinaryTree.findMaxValue;

public class BinaryTreeTest {

    @Test
    public void preOrderTest() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
        String[] test = {"a", "b", "d", "e", "c", "f", "g"};
        assertArrayEquals("preOrder returns root-> left-> right branches", test, testTree.preOrder());
    }

    @Test
    public void inOrderTest() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
        String[] test = {"d", "b", "e", "a", "f", "c", "g"};
        assertArrayEquals("inOrder returns left-> root-> right branches", test, testTree.inOrder());
    }

    @Test
    public void postOrderTest() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
        String[] test = {"d", "e", "b", "f", "g", "c", "a"};
        assertArrayEquals("postOrder returns left-> right-> root branches", test, testTree.postOrder());
    }

    @Test
    public void breadthFirstTest() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
    }

    @Test
    public void findMaxValueTest_Positives() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(1, new TreeNode(2, new TreeNode(6, null, null), new TreeNode(15, null, null)), new TreeNode(4, new TreeNode(21, null, null), new TreeNode(9, null, null)));
        assertEquals("findMaxValue returns max value from tree", 21, findMaxValue(maxTree));
    }

    @Test
    public void findMaxValueTest_Zero() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(-1, new TreeNode(-2, new TreeNode(-6, null, null), new TreeNode(-15, null, null)), new TreeNode(-4, new TreeNode(0, null, null), new TreeNode(-9, null, null)));
        assertEquals("findMaxValue returns max value from tree", 0, findMaxValue(maxTree));
    }

    @Test
    public void findMaxValueTest_Negatives() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(-1, new TreeNode(-2, new TreeNode(-6, null, null), new TreeNode(-15, null, null)), new TreeNode(-4, new TreeNode(-21, null, null), new TreeNode(-9, null, null)));
        assertEquals("findMaxValue returns max value from tree", -1, findMaxValue(maxTree));
    }

    @Test
    public void findMaxValueTest_UnevenTree() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(1, new TreeNode(2, new TreeNode(6, null, null), new TreeNode(15, null, null)), new TreeNode(4, new TreeNode(21, null, null), null));
        assertEquals("findMaxValue returns max value from uneven tree", 21, findMaxValue(maxTree));
    }
}