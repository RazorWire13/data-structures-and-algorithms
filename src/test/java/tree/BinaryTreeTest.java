package tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void preOrder() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
        String[] test = {"a", "b", "d", "e", "c", "f", "g"};
        assertArrayEquals("preOrder returns root-> left-> right branches", test, testTree.preOrder());
    }

    @Test
    public void inOrder() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
        String[] test = {"d", "b", "e", "a", "f", "c", "g"};
        assertArrayEquals("inOrder returns left-> root-> right branches", test, testTree.inOrder());
    }

    @Test
    public void postOrder() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
        String[] test = {"d", "e", "b", "f", "g", "c", "a"};
        assertArrayEquals("postOrder returns left-> right-> root branches", test, testTree.postOrder());
    }

    @Test
    public void breadthFirst() {
        BinaryTree<String> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a", new TreeNode("b", new TreeNode("d", null, null), new TreeNode("e", null, null)), new TreeNode("c", new TreeNode("f", null, null), new TreeNode("g", null, null)));
    }
}