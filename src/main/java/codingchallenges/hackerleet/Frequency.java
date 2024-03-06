package codingchallenges.hackerleet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Frequency {
    public static void main(String[] args) {

//        List<String> wordList = Arrays.asList("to", "to", "to", "too", "two", "one", "two", "to", "two", "to", "two", "too");
        Path path = Paths.get("src/main/codingchallenges/alice.txt");
        List<String> inputFile = readFile(path);
        Map<String, Integer> frequencyMap = inputFile.parallelStream().collect(Collectors.toConcurrentMap(w -> w, w -> 1, Integer::sum));

        System.out.println(frequencyMap);

//        frequencyMap.entrySet().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));

    }

    private static List<String> readFile(final Path path) {

        List<String> lines = null;
        try (Stream<String> fileInfo = Files.lines(path)) {
            lines = fileInfo.collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }


}
