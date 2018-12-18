package fizzbuzztree;

import tree.Node;

import java.util.ArrayList;

public class FizzBuzzTree<T> {


    public static ArrayList<Node> fizzBuzzHelper(Node<T> node) {
        if ((node.value % 3) == 0 && (node.value % 5) == 0) {
            node.value = "FizzBuzz";
        } else if ((node.value % 5) == 0) {
            node.value = "Buzz";
        } else if ((node.value % 3) == 0) {
            node.value = "Fizz";
        }
    }
}
