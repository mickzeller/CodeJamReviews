package codingchallenges.hackerleet;

import java.util.HashMap;
import java.util.Map;

//Input: n = 12
//Output: 3
//Explanation: 12 = 4 + 4 + 4.
public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(numSquaress(17));
    }

    public static int numSquaress(int n) {
        int[] record = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            record[i] = i;
            for (int j = 1; j * j <= i; j++) {
                record[i] = Math.min(record[i - j * j] + 1, record[i]);
            }
        }

        return record[n];
    }

    public static int numSquares(int n) {
        Map<Integer, Integer> perfectSquares = new HashMap<>();
        if (n < 2) {
            throw new IllegalArgumentException("No perfect squares");
        }
        for (int i = 2; i < (int) Math.sqrt(n); i++) {
            int complement = n - (int) Math.pow(i, 2);
            perfectSquares.put((int) Math.pow(i, 2), complement);
        }


        System.out.println("perfect square: " + perfectSquares.keySet());
        System.out.println("complement: " + perfectSquares.values());
        return 1;
    }
}
