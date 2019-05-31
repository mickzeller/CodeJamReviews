package main.codingchallenges.google.interviewbook;

import java.util.ArrayList;
import java.util.List;

public class SpiralOrderMatrix {

    //Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

    public static void main(String[] args) {
        int[][] matrix =
                {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        System.out.println(spiralOrdered(matrix));
        System.out.println(spiralOrder(matrix));
    }

    public static List<Integer> spiralOrdered(int[][] matrix) {
//        int[][] spiralMatrix = new int[matrix.length][matrix[0].length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i % 2 == 0) {
                    // spiralMatrix[i][j] = matrix[i][j];
                    list.add(matrix[i][j]);
                } else {
                    //spiralMatrix[i][j] = matrix[i][(matrix[0].length - 1) - j];
                    list.add(matrix[i][(matrix[0].length - 1) - j]);
                }
            }
        }
        return list;
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        if (matrix.length == 0)
            return ans;
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) {
                ans.add(matrix[r1][c]);
            }
            for (int r = r1 + 1; r <= r2; r++) {
                ans.add(matrix[r][c2]);
            }
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) {
                    ans.add(matrix[r2][c]);
                }
                for (int r = r2; r > r1; r--) {
                    ans.add(matrix[r][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return ans;
    }
}
