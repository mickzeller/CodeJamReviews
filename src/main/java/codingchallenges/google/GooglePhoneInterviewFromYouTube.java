package main.codingchallenges.google;

public class GooglePhoneInterviewFromYouTube {

    public static void main(String[] args) {
        int[] array = {6, 9, 11, 10, 1, 5};
        System.out.println(min(array) + " is the smallest number: O(n) speed\n");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("\n--------------\n");

        System.out.println(secondMin(array) + " is the second smallest number: O(n log n) speed, with a space complexity of O(log n)\n");

        System.out.println("Naive second min: " + naiveSecondMin(array) + " is the second smallest number: O(n^2) speed\n");


        sort(array, 0, array.length - 1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static int position(int[] array, int low, int high) {
        int point = array[high];
        int index = (low - 1);

        for (int i = low; i < high; i++) {

            if (array[i] <= point) {
                index++;
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        int temp = array[index + 1];
        array[index + 1] = array[high];
        array[high] = temp;

        return index + 1;

    }

    public static void sort(int[] array, int low, int high) {
        if (low < high) {
            int pi = position(array, low, high);
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    public static int secondMin(int[] array) {
        sort(array, 0, array.length - 1);
        return array[1];
    }

    public static int naiveSecondMin(int[] array) {
        int min = array[0];
        int secondMin = array[1];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            }
        }
        return secondMin;
    }
}