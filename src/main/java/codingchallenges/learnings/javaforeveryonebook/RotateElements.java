package codingchallenges.learnings.javaforeveryonebook;

import java.util.Arrays;

public class RotateElements {


    public static void main(String[] args) {
        int[] array = {2, 3, 5, 7, 11, 13};
        int[] copy = new int[array.length];

        for (int i = 0; i < array.length - 1; i++) {
            copy[i] = array[i + 1];
        }

        copy[copy.length - 1] = array[0];

//        Arrays.stream(array).forEach(System.out::println);
//        Arrays.stream(copy).forEach(System.out::println);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(copy));
    }

}
