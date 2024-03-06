package codingchallenges.hackerleet;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {
        String hi = "Hello";
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < hi.length(); i++) {
            stack.push(hi.charAt(i));
        }

        for (int i = 0; i < hi.length(); i++) {
            sb.append(stack.pop());
        }
        System.out.println(sb);
        System.out.println(reverse("MickZeller"));

    }

    // Time complexity: O(n)
    // Space complexity: O(n)
    public static String reverse(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = word.length - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }

        return new String(word);
    }
}
