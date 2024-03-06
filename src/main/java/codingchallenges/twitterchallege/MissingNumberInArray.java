package codingchallenges.twitterchallege;

import java.util.stream.Stream;

public class MissingNumberInArray {

    public static void main(String[] args) {
        Stream<Integer> values = Stream.of(1, 2, 2, 3, 3, 3, 4, 2);
        values.forEach(System.out::println);
    }
}
