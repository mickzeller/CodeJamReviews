package codingchallenges.learnings;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FunctionalPrime {

    public static void main(String[] args) {
        Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(i -> System.out.println("i: " + i + " " + isPrime(i)));
    }

    private static boolean isPrime(final int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }

}
