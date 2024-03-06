package codingchallenges.google.interviewbook;

public class Solution {


    public static void main(String[] args) {
        System.out.println(reverseWords("reverSe this, code!"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedWord = new StringBuilder();
        for (String word : words) {
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord.append(word.charAt(i));
            }
            reversedWord.append(" ");
        }
        return reversedWord.toString().trim();
    }
}
