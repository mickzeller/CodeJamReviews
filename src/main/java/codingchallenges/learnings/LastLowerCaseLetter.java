package codingchallenges.lucidchallenge;

public class LastLowerCaseLetter {

    public static void main(String[] args) {
        String word = "jIuuLKIHNLoI";
        int last = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(word.charAt(i))) {
                last = i;
            }
        }
        System.out.println(word.length() + " " + last);

        for (int i = 1; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (j < 10) {
                    System.out.printf("%d:0%d AM%n", i, j);

                } else {
                    System.out.printf("%d:%d AM%n", i, j);
                }
            }
        }

    }
}
