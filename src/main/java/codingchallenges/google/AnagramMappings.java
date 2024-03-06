package codingchallenges.google;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramMappings {


    public static void main(String[] args) {
        int[] a = {12, 28, 46, 32, 50};
        int[] b = {50, 12, 32, 46, 28};

        System.out.println(Arrays.toString(anagramMappings(a, b)));


        for (int number : anagramMappings(a, b)) {
            System.out.println(number);
        }

        System.out.println(Arrays.toString(anagram(a, b)));


    }

    public static int[] anagramMappings(int[] a, int[] b) {

        int[] p = new int[a.length];

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    p[i] = j;
                }
            }

        }


        return p;
    }

    public static int[] anagram(int[] a, int[] b) {

        int[] p = new int[a.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < b.length; i++) {
            map.put(b[i], i);
        }

        for (int i = 0; i < a.length; i++) {
            p[i] = map.get(a[i]);
        }

        return p;
    }


}

