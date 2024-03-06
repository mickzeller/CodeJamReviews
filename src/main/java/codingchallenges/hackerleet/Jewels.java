package codingchallenges.hackerleet;

import java.util.HashSet;
import java.util.Set;

public class Jewels {

    public static void main(String[] args) {
        //J = "aA", S = "aAAbbbb"
        int count = 0;
        String jewels = "aA";
        String stones = "aAAbbbb";


    }

    // Time complexity: O(j.length + s.length)
    // Space complexity: O(j.length)
    public int numJewelsInStones(String j, String s) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < j.length(); i++) {
            set.add(j.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}
