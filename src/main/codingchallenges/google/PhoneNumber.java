package main.codingchallenges.google;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    private static final String[] KEYS = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
//        letterCombinations("25");
        System.out.println(letterCombinations("6425"));
        System.out.println(letterCombinations("6425").size());

    }

    public static List<String> letterCombinations(String digits) {
        // 0, 1 have no letters associated with them
        String keypadAlphabet[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> groupOfLetters = new ArrayList<>();

        if (digits.length() == 0) {
            return groupOfLetters;
        }

        groupOfLetters.add("");

        for (int i = 0; i < digits.length(); i++)
            groupOfLetters = combine(keypadAlphabet[digits.charAt(i) - '0'], groupOfLetters);

        return groupOfLetters;
    }

    public static List<String> combine(String digit, List<String> list) {
        List<String> txtonyms = new ArrayList<>();

        for (int i = 0; i < digit.length(); i++)
            for (String grouping : list)
                txtonyms.add(grouping + digit.charAt(i));

        return txtonyms;
    }

}
