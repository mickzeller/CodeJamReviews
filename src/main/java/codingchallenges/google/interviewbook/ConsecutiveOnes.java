package codingchallenges.google.interviewbook;


public class ConsecutiveOnes {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(array));
    }

    // O(n) O(sqrt(n))
    public static int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, cmax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                c++;
            } else {
                if (c > cmax)
                    cmax = c;
                c = 0;
            }
        }
        return cmax > c ? cmax : c;
    }
}
