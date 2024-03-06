package codingchallenges.hackerleet;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 4, 2};
        System.out.println(solution(array));
    }

    public static int solution(int[] a) {
        OptionalInt min = Arrays.stream(a).min();
        if (min.isPresent() && min.getAsInt() < 0) {
            return 1;
        }


        IntStream myStream = Arrays.stream(a).parallel().sorted();

        //int numberToReturn = myStream.map((x, x2) ->
        List<Integer> theNextOne = Arrays.stream(myStream.toArray()).boxed().collect(toList());
        //Arrays.asList(myStream.toArray());

        for (int i = 0; i < theNextOne.size(); i++) {
            if (theNextOne.get(i) + 1 != theNextOne.get(i + 1)) {
                return theNextOne.get(i) + 1;
            }
        }

        return 0;
    }

}
