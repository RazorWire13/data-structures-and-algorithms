package tree;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static tree.BinaryTree.findMaxValue;

public class BinaryTreeTest {
    BinaryTree<String> streamTree = new BinaryTree<>();
    private final ByteArrayOutputStream output = new ByteArrayOutputStream();
    private final PrintStream printOut = System.out;

    @Before
    public void byteStreams() {
        System.setOut(new PrintStream(output));
    }

    @After
    public void reset() {
        System.setOut(printOut);
    }

    // PRE ORDER TESTS
    @Test
    public void preOrderTest() {
        BinaryTree<TreeNode> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a",
                new TreeNode("b",
                        new TreeNode("d", null, null),
                        new TreeNode("e", null, null)),
                new TreeNode("c",
                        new TreeNode("f", null, null),
                        new TreeNode("g", null, null)));
        ArrayList<TreeNode> preOrderList = BinaryTree.preOrder(testTree.root);
        assertEquals("preOrder has a size of 7", 7, preOrderList.size());
        assertEquals("preOrder root position has a value of 'a'", "a",preOrderList.get(0).value);
        assertEquals("preOrder first left position has a value of 'b'", "b",preOrderList.get(1).value);
        assertEquals("preOrder first right position has a value of 'c'", "c",preOrderList.get(4).value);
    }

    // IN ORDER TESTS
    @Test
    public void inOrderTest() {
        BinaryTree<TreeNode> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a",
                new TreeNode("b",
                        new TreeNode("d", null, null),
                        new TreeNode("e", null, null)),
                new TreeNode("c",
                        new TreeNode("f", null, null),
                        new TreeNode("g", null, null)));
        ArrayList<TreeNode> inOrderList = BinaryTree.inOrder(testTree.root);
        assertEquals("inOrder has a size of 7", 7, inOrderList.size());
        assertEquals("inOrder first left position has a value of 'd'", "d",inOrderList.get(0).value);
        assertEquals("inOrder root position has a value of 'a'", "a",inOrderList.get(3).value);
        assertEquals("inOrder first right position has a value of 'f'", "f",inOrderList.get(4).value);
    }

    // POST ORDER TESTS
    @Test
    public void postOrderTest() {
        BinaryTree<TreeNode> testTree = new BinaryTree<>();
        testTree.root = new TreeNode("a",
                new TreeNode("b",
                        new TreeNode("d", null, null),
                        new TreeNode("e", null, null)),
                new TreeNode("c",
                        new TreeNode("f", null, null),
                        new TreeNode("g", null, null)));
        ArrayList<TreeNode> postOrderList = BinaryTree.postOrder(testTree.root);
        assertEquals("postOrder has a size of 7", 7, postOrderList.size());
        assertEquals("postOrder first left position has a value of 'd'", "d", postOrderList.get(0).value);
        assertEquals("postOrder first right position has a value of 'f'", "f", postOrderList.get(3).value);
        assertEquals("postOrder root position has a value of 'a'", "a", postOrderList.get(6).value);
    }

    // BREADTH FIRST TESTS
//    @Test
//    public void breadthFirstTest() {
//        BinaryTree<String> testTree = new BinaryTree<>();
//        testTree.root = new TreeNode("a",
//                new TreeNode("b",
//                        new TreeNode("d", null, null),
//                        new TreeNode("e", null, null)),
//                new TreeNode("c",
//                        new TreeNode("f", null, null),
//                        new TreeNode("g", null, null)));
//        testTree.breadthFirst(streamTree);
//        assertEquals("The output should match expected", "a\nb\nc\nd\ne\nf\n", output.toString());
//    }

    // MAX VALUE TESTS
    @Test
    public void findMaxValueTest_Positives() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(6, null, null),
                        new TreeNode(15, null, null)),
                new TreeNode(4,
                        new TreeNode(21, null, null),
                        new TreeNode(9, null, null)));
        assertEquals("findMaxValue returns max value from tree", 21, findMaxValue(maxTree));
    }

    @Test
    public void findMaxValueTest_Zero() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(-1,
                new TreeNode(-2,
                        new TreeNode(-6, null, null),
                        new TreeNode(-15, null, null)),
                new TreeNode(-4,
                        new TreeNode(0, null, null),
                        new TreeNode(-9, null, null)));
        assertEquals("findMaxValue returns max value from tree", 0, findMaxValue(maxTree));
    }

    @Test
    public void findMaxValueTest_Negatives() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(-1,
                new TreeNode(-2,
                        new TreeNode(-6, null, null),
                        new TreeNode(-15, null, null)),
                new TreeNode(-4,
                        new TreeNode(-21, null, null),
                        new TreeNode(-9, null, null)));
        assertEquals("findMaxValue returns max value from tree", -1, findMaxValue(maxTree));
    }

    @Test
    public void findMaxValueTest_UnevenTree() {
        BinaryTree<Integer> maxTree = new BinaryTree<>();
        maxTree.root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(6, null, null),
                        new TreeNode(15, null, null)),
                new TreeNode(4,
                        new TreeNode(21, null, null),
                        null));
        assertEquals("findMaxValue returns max value from uneven tree", 21, findMaxValue(maxTree));
    }
}