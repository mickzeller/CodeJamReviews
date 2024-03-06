package codingchallenges.google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class GFG {
    // A function to print all prime factors
    // of a given number n

    public static void main(String[] args) {
        int[] p = new int[26];
        int n = 0;
        int c = 0;
        while (n < p.length) {
            if (isPrime(c)) {
                p[n] = c;
                n++;
            }
            c++;
        }

        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                l.add(p[i] * p[j]);
            }
        }

        l.forEach(System.out::println);

    }

    private static boolean isPrime(final int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }
}
