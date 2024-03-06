package codingchallenges.learnings;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TypeInferenceExample {

    private static Path path = Paths.get("src/main/first_hundred_thousand_primes");

    public static void main(String[] args) {

        explicitTypeDeclarationJava8(path);

        inferredTypeDeclarationJava10(path);

    }


    private static void explicitTypeDeclarationJava8(final Path path) {

        try (Stream<String> fileInfo = Files.lines(path, StandardCharsets.UTF_8)) {
            List<String> lines = fileInfo.collect(Collectors.toList());
            lines.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void inferredTypeDeclarationJava10(final Path path) {

        try (final var fileInfo = Files.lines(path, StandardCharsets.UTF_8)) {
            final var lines = fileInfo.collect(Collectors.toList());
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
