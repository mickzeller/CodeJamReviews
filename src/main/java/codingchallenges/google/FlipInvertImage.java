package main.codingchallenges.google;

import java.util.Arrays;

public class FlipInvertImage {

    //Input: [[1,1,0],[1,0,1],[0,0,0]]
    //Output: [[1,0,0],[0,1,0],[1,1,1]]
    //Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
    //Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


    public static void main(String[] args) {

        //[[1,1,0,0],[1,0,0,1],[0,1,1,1],[1,0,1,0]]
        //

        int[][] a = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] b = {{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        flipAndInvertImage(b);


    }


    public static int[][] flipAndInvertImage(int[][] a) {
        // crap doesn't work
        //[[1,1,0,0],[0,1,1,0],[0,0,0,1],[1,0,1,0]]
        int[][] output = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 1}, {1, 0, 1, 0}};
        System.out.println(Arrays.deepToString(a));
        //flip the array
        int count = 0;
        for (int[] array : a) {


            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;


            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                } else if (array[i] == 0) {
                    array[i] = 1;
                }
            }
            a[count] = array;
            count++;
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(output));
        return a;
    }

    public static int[][] flipAndInvertImageWorking(int[][] a) {

        int size = a[0].length;
        for (int[] row : a) {
            for (int i = 0; i < (size + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[size - 1 - i] ^ 1;
                row[size - 1 - i] = temp;
            }
        }

        return a;
    }

    //        int C = A[0].length;
    //        for (int[] row: A)
    //            for (int i = 0; i < (C + 1) / 2; ++i) {
    //                int tmp = row[i] ^ 1;
    //                row[i] = row[C - 1 - i] ^ 1;
    //                row[C - 1 - i] = tmp;
    //            }
    //
    //        return A;


}


//[[1, 1, 0, 0], [1, 0, 0, 1], [0, 0, 0, 1], [1, 0, 1, 0]]
//[[1, 0, 0, 1], [0, 1, 0, 0], [0, 1, 1, 0], [1, 1, 0, 1]]
//[[1, 1, 0, 0], [0, 1, 1, 0], [0, 0, 0, 1], [1, 0, 1, 0]]