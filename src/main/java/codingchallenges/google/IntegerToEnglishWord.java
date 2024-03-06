package codingchallenges.google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Map.entry;

public class IntegerToEnglishWord {

    public static void main(String[] args) {
        int number = 217128725;
        StringBuilder numericStringBuilder = new StringBuilder();
        System.out.println(number % 1000);
        Map<Integer, String> hashMap = Map.ofEntries(
                entry(1, "one"),
                entry(2, "two"),
                entry(3, "three"),
                entry(4, "four"),
                entry(5, "five"),
                entry(6, "six"),
                entry(7, "seven"),
                entry(8, "eight"),
                entry(9, "nine")
        );

        Map<Integer, String> decimalPlace = Map.ofEntries(
                entry(10, "th"),
                entry(100, "Hundred"),
                entry(1000, "Thousand"),
                entry(1_000_000, "Million"),
                entry(1_000_000_000, "Billion")
        );
        int num = 2454252;
        System.out.println("digitSum(2454252) " + digitSum(num));
        String[] numbersToEnglish = intToString(number, numericStringBuilder, hashMap);

        System.out.println("digitLength(217128725) " + digitLength(number));
    }

    private static String[] intToString(int number, StringBuilder numericStringBuilder, Map<Integer, String> map) {
        String stringInt = Integer.toString(number);
        IntStream.range(0, stringInt.length())
                .map(i -> Character.getNumericValue(stringInt.charAt(i)))
                .filter(map::containsKey)
                .mapToObj(i -> map.getOrDefault(i, "") + " ")
                .forEach(numericStringBuilder::append);

        return numericStringBuilder.toString().split(" ");
    }


    public static int digitSum(int n) {
        int t = n % 10;
        if (n == 0) {
            return 0;
        }
        return digitSum(n / 10) + t;
    }

    public static int digitLength(int n) {
        if (n == 0) {
            return 0;
        }
        return digitLength(n / 10) + 1;
    }
}
