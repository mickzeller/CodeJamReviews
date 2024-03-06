package codingchallenges.google.interviewbook;

import java.util.HashSet;
import java.util.Set;

public class AllUniqueChars {

    // Chapter 1 I Arrays and Strings
    //Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

    //worst case - O(n)

    // INPUT QUESTION:
    // Can I assume that capitalization doesn't matter?
    // What about spacing, numbers or punctuation?
    // What if the word is NULL?


    public static void main(String[] args) {
        System.out.println(isUnique("abcdefghijklmnopqrstuvwxyzz"));
    }

    private static boolean isUnique(String word) {
        //boolean[] alphabet = new boolean[26];
        if (word == null) {
            throw new IllegalArgumentException("Input is null");
        }

        Set<Character> set = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            if (set.contains(word.charAt(i))) {
                return false;
            }
            set.add(word.charAt(i));
        }

        return true;
    }


}
