package main.codingchallenges.google;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIslands {


    //11110
    //11010
    //11000
    //00000

    public static void main(String[] args) {
        char[][] array = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '0', '1'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '1', '1'}};
        System.out.println(numIslandsQueue(array));
    }

    public static int numIslandsQueue(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rowNumber = grid.length;
        int columnNumber = grid[0].length;
        int islands = 0;

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    grid[i][j] = '0';
                    Queue<Integer> neighbors = new LinkedList<>();
                    neighbors.add(i * columnNumber + j);
                    while (!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        int row = id / columnNumber;
                        int column = id % columnNumber;
                        if (row - 1 >= 0 && grid[row - 1][column] == '1') {
                            neighbors.add((row - 1) * columnNumber + column);
                            grid[row - 1][column] = '0';
                        }
                        if (row + 1 < rowNumber && grid[row + 1][column] == '1') {
                            neighbors.add((row + 1) * columnNumber + column);
                            grid[row + 1][column] = '0';
                        }
                        if (column - 1 >= 0 && grid[row][column - 1] == '1') {
                            neighbors.add(row * columnNumber + column - 1);
                            grid[row][column - 1] = '0';
                        }
                        if (column + 1 < columnNumber && grid[row][column + 1] == '1') {
                            neighbors.add(row * columnNumber + column + 1);
                            grid[row][column + 1] = '0';
                        }
                    }
                }
            }
        }

        return islands;
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int numberOfIslands = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int columnumn = 0; columnumn < grid[row].length; columnumn++) {
                System.out.println("grid[" + row + "][" + columnumn + "]");

                if (grid[row][columnumn] == '1') {
                    numberOfIslands++;
                    depthFirstSearch(grid, row, columnumn);
                }
            }
        }

        return numberOfIslands;
    }

    // Time complexity O(M x N) where M is rows N is columnumns
    public static void depthFirstSearch(char[][] grid, int row, int column) {

        if (row < 0 || column < 0 || row >= grid[0].length || column >= grid.length || grid[row][column] == '0') {
            return;
        }

        grid[row][column] = '0';
        depthFirstSearch(grid, row - 1, column);
        depthFirstSearch(grid, row + 1, column);
        depthFirstSearch(grid, row, column - 1);
        depthFirstSearch(grid, row, column + 1);

    }


}
