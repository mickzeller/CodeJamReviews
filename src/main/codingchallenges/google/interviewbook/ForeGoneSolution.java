package main.codingchallenges.google.interviewbook;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ForeGoneSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = in.nextInt();
        int[] array = new int[T];
        for (int i = 0; i < T; i++) {
            array[i] = in.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            results(i, array[i]);
        }
    }

    public static void results(int testCaseNumber, int number) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < String.valueOf(number).length(); i++) {

            if (locationDigit(number, i) == 4) {
                int temp = (int) (locationDigit(number, i) * Math.pow(10, i));
                a += temp / 2;
                b += temp / 2;
            }
            if (locationDigit(number, i) != 4) {
                a += (locationDigit(number, i) * Math.pow(10, i));
            }
        }
        System.out.printf("Case #%d: %d %d%n", (testCaseNumber + 1), a, b);
    }

    public static int locationDigit(int number, int index) {
        return (int) (number / Math.pow(10, index) % 10);
    }

}
