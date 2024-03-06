package codingchallenges.google;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToCatchACheat {


    public static void main(String[] args) {
        List<String> list = readFile();
        String[] firstLine = list.get(0).split(" ");
        final int CARDS_IN_DECK = Integer.parseInt(firstLine[0]);
        final int GAMES_TO_PLAY = Integer.parseInt(firstLine[1]);
        int[] cards = new int[CARDS_IN_DECK];

        for (int i = 0; i < GAMES_TO_PLAY; i++) {
            Arrays.fill(cards, 0);

            String[] line = list.get(i + 1).split(" ");

            for (int k = 0; k < line.length; k++) {
                cards[k] = Integer.parseInt(line[k]);
            }
            Arrays.sort(cards);
            System.out.println(missingCard(cards));
        }
    }

    private static List<String> readFile() {
        Path path = Paths.get("src/main/codingchallenges/google/file");
        List<String> lines = new ArrayList<>();
        try (Stream<String> file = Files.lines(path)) {
            lines = file.collect(Collectors.toList());
            return lines;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    private static int missingCard(int[] cards) {
        IntStream stream = IntStream.of(cards);
        IntStream intStream = IntStream.range(1, cards.length + 1);
        return intStream.sum() - stream.sum();
    }

}
