package main.codingchallenges.lucidchallenge;

import java.util.*;
import java.util.stream.IntStream;

// LucidCharts 2019 coding challenge https://codekerfuffle.com


public class Cryptopangrams {

    public static void main(String[] args) {
//        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        int T = in.nextInt();
//        int[] array = new int[T];
//        for (int i = 0; i < T; i++) {
//            array[i] = in.nextInt();
//        }

        int[] t = {3292937, 175597, 18779, 50429, 375469, 1651121, 2102, 3722, 2376497, 611683, 489059, 2328901, 3150061, 829981, 421301, 76409, 38477, 291931, 730241, 959821, 1664197, 3057407, 4267589, 4729181, 5335543};
        TreeMap<Integer, Character> map = new TreeMap<>();
        int key = t.length + 1;
        int[] p = new int[26];
        TreeSet<Integer> treeSet = new TreeSet<>(primeFactor(t));
        System.out.println("size: " + treeSet.size());
        treeSet.forEach(System.out::println);


        for (int i = 0; i < treeSet.size(); i++) {
            int x = treeSet.pollFirst();
            p[i] = x;
            map.put(x, (char) ('A' + i));
        }

        char[] word = new char[key];
        System.out.println(Arrays.toString(word));

        for (int i = 0; i < t.length; i++) {
            int[] product = primeFactors(t[i]);


            if ((i - 1 > 0) && (i + 1 < t.length)) {

                if (map.containsKey(Integer.divideUnsigned(t[i + 1], product[0])) && !map.containsKey(Integer.divideUnsigned(t[i - 1], product[0]))) {
                    word[i] = map.get(product[1]);
                } else {
                    word[i] = map.get(product[0]);
                }
            } else {
                word[i] = map.get(product[0]);
                word[word.length - 1] = map.get(product[1]);
            }

        }

    }

    private static List<Integer> primeFactor(int[] array) {

        List<Integer> factors = new ArrayList<>();
        for (int j = 0; j < array.length; j++) {

            int n = array[j];
            for (int i = 2; i <= n / i; i++) {
                while (n % i == 0) {
                    factors.add(i);
                    n /= i;
                }
            }
            if (n > 1) {
                factors.add(n);
            }
        }
        return factors;
    }

    public static int[] primeFactors(int n) {

        int[] prod = new int[2];
        while (n % 2 == 0) {
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, print i and divide n
            while (n % i == 0) {
                prod[0] = i;
                n /= i;
            }
        }
        if (n > 2) {
            prod[1] = n;
        }
        return prod;
    }

    private static boolean isPrime(final int number) {
        return number > 1 && IntStream.range(2, number).noneMatch(i -> number % i == 0);
    }

    public static int recursiveGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return recursiveGCD(b, a % b);
        }
    }

    public static int euclidGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
}
