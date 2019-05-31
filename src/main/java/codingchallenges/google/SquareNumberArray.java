package main.codingchallenges.google;

import java.util.Arrays;

public class SquareNumberArray {
    //    Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order.

    public static void main(String[] args) {
        int[] array = {-4, -1, 0, 3, 10};
        int[] array2 = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(sortedSquares(array)));
        System.out.println(Arrays.toString(sortedSquares(array2)));
    }

    public static int[] sortedSquares(int[] a) {
        int[] squaredArray = new int[a.length];
        int max = (int) Math.pow(a[0], 2);
        for (int i = 0; i < a.length; i++) {
            if ((int) Math.pow(a[i], 2) > max) {
                int temp = (int) Math.pow(a[i], 2);
                squaredArray[i] = max;
                max = temp;
            }
            squaredArray[i] = (int) Math.pow(a[i], 2);
        }
        return squaredArray;
    }

}
