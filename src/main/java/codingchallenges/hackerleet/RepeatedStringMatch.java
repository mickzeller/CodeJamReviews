package codingchallenges.hackerleet;

import java.util.HashMap;
import java.util.Map;

public class RepeatedStringMatch {
    //Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
    //For example, with A = "abcd" and B = "cdabcdab".
    //Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
    //Note:
    //The length of A and B will be between 1 and 10000.

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        char bStart = b.charAt(0);

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                System.out.println(map.get(b.charAt(i)));
                System.out.println(b.charAt(i) + " " + i);
                break;
            } else {
                map.put(b.charAt(i), i);
            }
        }

    }
}
