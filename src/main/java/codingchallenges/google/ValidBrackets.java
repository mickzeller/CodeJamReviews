package codingchallenges.google;

import java.util.HashMap;
import java.util.Stack;

public class ValidBrackets {

    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;


    // Initialize hash map with mappings. This simply makes the code easier to read.
    public ValidBrackets() {
        this.mappings = new HashMap<>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public static void main(String[] args) {
        ValidBrackets validBrackets = new ValidBrackets();
        String test1 = "(){}[]";
        System.out.println(validBrackets.isValid(test1));
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (this.mappings.containsKey(c)) {

                char topElement = stack.empty() ? '#' : stack.pop();

                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
