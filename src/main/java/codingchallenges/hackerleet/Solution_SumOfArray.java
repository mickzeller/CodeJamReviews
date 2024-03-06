package codingchallenges.hackerleet;

import java.util.stream.IntStream;
import java.util.*;
import java.io.*;

public class Solution_SumOfArray {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] array) {
        return Arrays.stream(array).sum();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("solution.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrayCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] array = new long[arrayCount];

        String[] items = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


//		Stream<String> list = Arrays.stream(items);
//		list.forEach(System.out::println);

        IntStream.range(0, arrayCount).forEach(i -> {
            long arrayItem = Long.parseLong(items[i]);
            array[i] = arrayItem;
        });

        long result = aVeryBigSum(array);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

