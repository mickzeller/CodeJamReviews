package main.codingchallenges.hackerleet;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoInts {

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 15};
        int target = 17;
        Arrays.stream(twoSum(array, target)).forEach(System.out::println);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
