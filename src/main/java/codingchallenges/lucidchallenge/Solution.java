package main.codingchallenges.lucidchallenge;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//test
public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scanner.nextLine());
        String[] items = scanner.nextLine().split(" ");
        String input = scanner.nextLine();
        Map<Character, String> set = new HashMap<>();


        for (int i = 0; i < items.length; i++) {
            set.put(items[i].charAt(0), items[i]);
        }

        String out = "";
        for (int i = 0; i < input.length(); i++) {


        }

        int x = 0;
        while (x < input.length()) {
            if (set.containsKey(input.charAt(x))) {
                System.out.println(set.get(input.charAt(x)));

                if (set.get(input.charAt(x)).length() + x < input.length() && set.get(input.charAt(x)).equals(input.substring(x, set.get(input.charAt(x)).length() + x))) {
                    out += set.get(input.charAt(x)) + " ";

                    x += set.get(input.charAt(x)).length();

                } else {
                    x++;
                }
            }
            x++;
        }

        System.out.println(out.trim());

    }
}