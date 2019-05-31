package main.codingchallenges.hackerleet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringOfNonRepeatingChars {

    public static void main(String[] args) {
        String first = "pwwkew";
        System.out.println(lengthOfLongestSubstringSlidingWindow(first));
    }

    public static int lengthOfLongestSubstringSlidingWindow(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int answer = 0, start = 0, end = 0;
        while (start < n && end < n) {
            // try to extend the range [i, j]
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end++));
                answer = Math.max(answer, end - start);
            } else {
                set.remove(s.charAt(start++));
            }
        }
        return answer;
    }

    public static int assumingASCII128Fastest(String s) {
        int n = s.length(), answer = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            answer = Math.max(answer, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return answer;

    }

    public static int slidingWindowOptimized(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public static int lengthOfLongestSubstrings(String string) {
        if (string != null) {
            int n = string.length();
            int answer = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (allUnique(string, i, j)) {
                        answer = Math.max(answer, j - i);
                    }
                }
            }
            return answer;
        }
        throw new IllegalArgumentException("Input value is null!");
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character character = s.charAt(i);
            if (set.contains(character)) {
                return false;
            } else {
                set.add(character);
            }
        }
        return true;
    }
}
