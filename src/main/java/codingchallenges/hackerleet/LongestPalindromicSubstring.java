package codingchallenges.hackerleet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String s = "mick zeller";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {

        HashMap<Character, Integer> counter = new HashMap<>();

        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

//        Map<Character, Integer> filteredMap = counter.entrySet().stream().filter(c -> c.getValue() > 1 &&)

        return "";
//        for (int count : counter.values()) {
//            if (count % 2 != 0) {
//                maxOddCount = Math.max(maxOddCount, count);
//                hasOddCount = true;
//            }
//        }
//
//        int maxLength = hasOddCount ? maxOddCount : s.length();
//        return s.substring(0, maxLength);


    }
//    public int removeDuplicates(int[] nums) {
//        int i = 0;
//        for (int n : nums)
//            if (i < 2 || n > nums[i-2])
//                nums[i++] = n;
//        return i;
//    }
}
//        Character[] alphabet = new Character[26];
//        for (int i = 0; i < alphabet.length; i++) {
//            alphabet[i] = (char) ('a' + i);
//        }
//
//        Map<Character, Integer> alphabetMap = Collections.synchronizedMap(new HashMap<>(26));
////        populate alphabetMap with alphabet letters and set value to 0 for all
//           Stream.of(alphabet).map(Arrays.stream(alphabet).map(a -> alphabetMap.keySet()));
////         not yet needed
//        for (char c : s.toCharArray()) {
//            alphabetMap.put(c, alphabetMap.getOrDefault(c, 0) + 1);
//        }
