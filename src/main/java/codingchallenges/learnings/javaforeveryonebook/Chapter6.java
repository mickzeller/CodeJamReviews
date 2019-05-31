package main.javaforeveryonebook;

import java.util.ArrayList;
import java.util.HashMap;

public class Chapter6 {

    public static void main(String[] args) {
        int[] inputArray = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int[] runArray = {1, 2, 5, 5, 3, 1, 2, 4, 3, 2, 2, 2, 2, 3, 6, 5, 5, 6, 3, 1};
        printDiceRun(runArray);
    }

    private static void printDiceRun(int[] array) {

        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            a.add(array[i]);
        }


        //store the number of repeats by index. (index is key, # of repeats is key)
        HashMap<Integer, Integer> repeats = new HashMap<>();

        //This will find store the number of repeated numbers starting at any given index.
        int index = 0;
        repeats.put(index, 1);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) == a.get(index)) {//Repeated values occurring
                repeats.put(index, repeats.get(index) + 1);
            } else {//End of a repeated sequence (even if that sequence was only 1 number long)
                repeats.put(i, 1);
                index = i;
            }
        }

        //Find the index at which the maximum number of repeats occurs
        int max = 0;
        int startIndex = 0;
        for (Integer i : repeats.keySet()) {
            //If the number of repeats is bigger than anything seen before
            if (repeats.get(i) > max) {
                //Store the number of repeats and the index at which they start
                max = repeats.get(i);
                startIndex = i;
            }
        }

    }

    private static void inRun(int[] a) {

        boolean inRun = false;
        for (int i = 0; i < a.length; i++) {
            int c = i;
            while (a[i] == a[c++]) {
                System.out.print(a[i]);
            }
        }
    }

    private static int altSum(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            } else {
                sum -= a[i];
            }
        }
        return sum;
    }

}
