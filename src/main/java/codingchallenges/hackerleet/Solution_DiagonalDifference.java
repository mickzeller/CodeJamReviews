package codingchallenges.hackerleet;

import java.io.*;
import java.util.*;
//Given a square matrix, calculate the absolute difference between the sums of its diagonals.
//For example, the square matrix  is shown below:
//1 2 3
//4 5 6
//9 8 9
//The left-to-right diagonal = . The right to left diagonal = . Their absolute difference is .
//Function description
//Complete the  function in the editor below. It must return an integer representing the absolute diagonal difference.
//diagonalDifference takes the following parameter:
//arr: an array of integers .
//Input Format
//The first line contains a single integer, , the number of rows and columns in the matrix .
//Each of the next  lines describes a row, , and consists of  space-separated integers .
//Constraints
//
//Output Format
//Print the absolute difference between the sums of the matrix's two diagonals as a single integer.
//Sample Input
//3
//11 2 4
//4 5 6
//10 8 -12
//Sample Output
//15
//Explanation
//The primary diagonal is:
//11
//   5
//     -12
//Sum across the primary diagonal: 11 + 5 - 12 = 4
//The secondary diagonal is:
//     4
//   5
//10
//Sum across the secondary diagonal: 4 + 5 + 10 = 19
//Difference: |4 - 19| = 15

public class Solution_DiagonalDifference {

	// Complete the diagonalDifference function below.
	static int diagonalDifference(int[][] array) {

		int topToBottomSum = 0;
		int bottomToTopSum = 0;
		for(int i = 0; i < array.length; i++) {
			topToBottomSum += array[i][i];
			bottomToTopSum += array[i][(array.length - 1) - i];
		}

		return (Math.abs(topToBottomSum - bottomToTopSum));
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("solution.txt"));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[][] array = new int[n][n];

		for (int i = 0; i < n; i++) {
			String[] rowItem = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
			for (int j = 0; j < n; j++) {
				int item = Integer.parseInt(rowItem[j]);
				array[i][j] = item;
			}

		}
		int result = diagonalDifference(array);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}

