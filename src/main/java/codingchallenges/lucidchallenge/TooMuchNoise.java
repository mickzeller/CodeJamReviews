package main.codingchallenges.lucidchallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TooMuchNoise {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());
        String[] items = scanner.nextLine().split(" ");
        String input = scanner.nextLine();
        Map<Character, String> map = new HashMap<>();


        for (int i = 0; i < items.length; i++) {
            map.put(items[i].charAt(0), items[i]);
        }

        String out = "";
        for (int i = 0; i < input.length(); i++) {


        }

        int x = 0;
        while (x < input.length()) {
            if (map.containsKey(input.charAt(x))) {

                if (map.get(input.charAt(x)).length() + x < input.length() && map.get(input.charAt(x)).equals(input.substring(x, map.get(input.charAt(x)).length() + x))) {
                    out += map.get(input.charAt(x)) + " ";
                    x += map.get(input.charAt(x)).length();

                } else {
                    x++;
                }
            }
            x++;
        }
        System.out.println(out.trim());

    }
}
