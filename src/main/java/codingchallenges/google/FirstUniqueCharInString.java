package codingchallenges.google;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInString {

    public static void main(String[] args) {
        String s = "mickmickmickzellermick";
        System.out.println(firstUniqChar(s));
    }

    // can I assume there is only letters? a-z or A-Z
    private static int firstUniqChar(String s) {
        int freq[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }

    private static int firstUniqueChar(String input) {
        Map<Character, Integer> map = new HashMap<>();
        int n = input.length();
        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            if (map.get(input.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
