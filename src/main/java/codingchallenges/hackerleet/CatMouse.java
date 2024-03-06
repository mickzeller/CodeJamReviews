package codingchallenges.hackerleet;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CatMouse {

//    private static final String LINE_SEPARATOR_REGEX = "(\r\n|[\n\r\u2028\u2029\u0085])?";
    private static final char SPACE_SEPARATOR = ' ';
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String FILE_PATH = "cat-mouse-test";
    private static final String CAT_A_WIN = "Cat A";
    private static final String CAT_B_WIN = "Cat B";
    private static final String MOUSE_WIN = "Mouse wins";

    public static void main(String[] args) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_PATH))) {
            int queryCount = 0;
            try {
                queryCount = SCANNER.nextInt();
                if (queryCount < 0) {
                    System.out.println("Number of queries cannot be negative");
                }
                SCANNER.nextLine();  // consume newline left-over
            } catch (InputMismatchException e) {
                System.out.println("Input was not an integer");
            }

            for (int queryIndex = 0; queryIndex < queryCount; queryIndex++) {
                String[] queryParameters = SCANNER.nextLine().split(String.valueOf(SPACE_SEPARATOR));

                int x = parseInt(queryParameters[0]);
                int y = parseInt(queryParameters[1]);
                int z = parseInt(queryParameters[2]);

                String resultOutput = catAndMouse(x, y, z);
                bufferedWriter.write(resultOutput);
                bufferedWriter.newLine();
            }
        }
        SCANNER.close();
    }

    private static int parseInt(String numberStr) {
        return Integer.parseInt(numberStr);
    }

    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x - z) < Math.abs(y - z)) {
            return CAT_A_WIN;
        } else if (Math.abs(x - z) > Math.abs(y - z)) {
            return CAT_B_WIN;
        } else {
            return MOUSE_WIN;
        }
    }
}
