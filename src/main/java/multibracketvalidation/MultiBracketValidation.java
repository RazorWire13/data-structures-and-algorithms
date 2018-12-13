package multibracketvalidation;

import stacksandqueues.Node;
import stacksandqueues.Stack;

public class MultiBracketValidation extends Stack {

    public static void main(String[] args) {
        bracketValidator("c{o(d)e}z");

    }

    Stack stack = new Stack();

    public boolean bracketValidator(String inputs) {
        for (int i = 0; i < inputs.length(); i++) {
            System.out.println(inputs.charAt(i));
            if (inputs.charAt(i) == "[") {
                stack.push(inputs.charAt(i));
            } else {
                if (inputs.charAt(i) == "{") {
                    stack.push(inputs.charAt(i));
                } else {
                    if (inputs.charAt(i) == "(") {
                        stack.push(inputs.charAt(i));
                    } else {
                        if (inputs.charAt(i) == "]") {
                            if (stack.pop() != "[") {
                                return false;
                            } else {
                                if (inputs.charAt(i) == "}") {
                                    if (stack.pop() != "{") {
                                        return false;
                                    } else {
                                        if (inputs.charAt(i) == ")") {
                                            if (stack.pop() != "(") {
                                                return false;
                                            } else {
                                                if (stack.peek() = null) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
