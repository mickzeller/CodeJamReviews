package main.codingchallenges.hackerleet;

import java.util.Arrays;
import java.util.Stack;

public class PlusOneArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(array)));
    }

    public static int[] plusOne(int[] digits) {
        int carry = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < digits.length; i++) {
            stack.push(digits[i]);
        }
        for (Integer integer : stack) {
            if (integer == 9) {
                carry++;
            }
        }

        return digits;
    }

    private int locationDigit(int number, int index) {
        return (int) (number / Math.pow(10, index) % 10);
    }
}
