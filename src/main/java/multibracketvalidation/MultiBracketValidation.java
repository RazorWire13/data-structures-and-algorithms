package multibracketvalidation;

import stacksandqueues.Stack;

public class MultiBracketValidation extends Stack {

    public static void main(String[] args) {
        bracketValidator("a b c d");
        bracketValidator("[]{}()");
        bracketValidator("{ a [ b ( c ) d ] e }");
        bracketValidator("[({}]");
        bracketValidator("(](");
        bracketValidator("{(})");
    }

    public static boolean bracketValidator(String inputs) {
        Stack stack = new Stack();

        // section pushes opening brackets to stack
        for (int i = 0; i < inputs.length(); i++) {
            if (inputs.charAt(i) == '[' || inputs.charAt(i) == '{' || inputs.charAt(i) == '(') {
                stack.push(inputs.charAt(i));
                System.out.println("pushed " + stack.peek() + " to the stack");

                // section checks for closing brackets
            } else if (inputs.charAt(i) == ']') {
                if (stack.peek() == null || (char) stack.pop() != '[') {
                    System.out.println("] is imbalanced - FALSE\n");
                    return false;
                }

            } else if (inputs.charAt(i) == '}') {
                if (stack.peek() == null || (char) stack.pop() != '{') {
                    System.out.println("} is imbalanced - FALSE\n");
                    return false;
                }

            } else if (inputs.charAt(i) == ')') {
                if (stack.peek() == null || (char) stack.pop() != '(') {
                    System.out.println(") is imbalanced - FALSE\n");
                    return false;
                }
            }
        }

        // section checks for end of stack imbalance
        if (stack.peek() != null) {
            System.out.println("Imbalanced end of stack - FALSE\n");
            return false;
        }

        // section validates true
        System.out.println("Balanced - Zen achieved - TRUE\n");
        return true;
    }
}