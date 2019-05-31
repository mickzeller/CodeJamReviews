package main.learnings;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CountFrequencyOfHighestNumber {

    public static void main(String[] args) {
        int[] a = {-1, 5, -4, 5, 5, 5, 5, 5, 5};
        System.out.println(countHighestNumberIsPresent(a));
    }

    public static int countHighestNumberIsPresent(int[] a) {
        int maxNumber = Arrays.stream(a).max().getAsInt();
        return Collections.frequency(IntStream.of(a).boxed().collect(toList()), maxNumber);
    }

}
