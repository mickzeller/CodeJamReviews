package main.codingchallenges.google;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglishWord {

    public static void main(String[] args) {
        int number = 123;
        StringBuilder num = new StringBuilder();
        System.out.println(number % 1000);
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        hashMap.put(6, "Six");
        hashMap.put(7, "Seven");
        hashMap.put(8, "Eight");
        hashMap.put(9, "Nine");


        Map<Integer, String> decimalPlace = new HashMap<>();
        decimalPlace.put(10, "th");
        decimalPlace.put(100, "Hundred");
        decimalPlace.put(1000, "Thousand");
        decimalPlace.put(1_000_000, "Million");
        decimalPlace.put(1_000_000_000, "Billion");

        String output = intToString(number, num, hashMap);
        System.out.println(digitLength(123456789));

    }

    private static String intToString(int number, StringBuilder num, Map<Integer, String> map) {
        String stringInt = Integer.toString(number);
        for (int i = 0; i < stringInt.length(); i++) {
            if (map.containsKey(Integer.parseInt(stringInt.substring(i, i + 1)))) {
                num.append(map.get(Integer.parseInt(stringInt.substring(i, i + 1))));
            }
        }
        System.out.println(num);

        return "";
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
