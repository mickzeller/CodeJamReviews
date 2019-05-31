package main.codingchallenges.hackerleet;

public class RotateString {

    public static void main(String[] args) {
        System.out.println(rotateString("", " "));
    }

    public static boolean rotateString(String a, String b) {
        if (a.equals("")) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            a = a.substring(1) + a.charAt(0);
            if (a.equalsIgnoreCase(b))
                return true;
        }
        return false;
    }
}
