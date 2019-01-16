package hashtable;

import tree.BinaryTree;
import tree.TreeNode;

public class TreeIntersection<T> {

    public static void main(String[] args) {
        BinaryTree<String> tree1 = new BinaryTree<>();
        tree1.root = new TreeNode("a",
                new TreeNode("b",
                        new TreeNode("d"),
                        new TreeNode("e")),
                new TreeNode("c",
                        new TreeNode("f"),
                        new TreeNode("g")));

        BinaryTree<String> tree2 = new BinaryTree<>();
        tree2.root = new TreeNode("a",
                new TreeNode("1",
                        new TreeNode("d"),
                        new TreeNode("3")),
                new TreeNode("2",
                        new TreeNode("f"),
                        new TreeNode("4")));
//        System.out.println(duplicateTreeValues(tree1, tree2).toString());
        System.out.println(BinaryTree.preOrder(tree1.root));
    }

//    public static Set<String> duplicateTreeValues(BinaryTree tree1, BinaryTree tree2) {
//        ArrayList<TreeNode> morphList1 = BinaryTree.preOrder(tree1.root);
//        Set<String> treeOneVals = new HashSet<>(morphList1);
//        ArrayList<TreeNode> morphList2 = BinaryTree.preOrder(tree2.root);
//        Set<String> treeTwoVals = new HashSet<>(morphList2);
//        Set<String> duplicateVals = new HashSet<>();
//
//        for (String value : treeOneVals) {
//            if (treeTwoVals.contains(value)) {
//                duplicateVals.add(value);
//            }
//        }
//        return duplicateVals;
//    }
}
