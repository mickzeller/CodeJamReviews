package codingchallenges.hackerleet;

public class GCF {

    public static void main(String[] args) {
        int b = 3292937;
        int a = 175597;

        System.out.println(euclidGCD(a, b));
        System.out.println(recursiveGCD(b, a));

    }


    public static int recursiveGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return recursiveGCD(b, a % b);
        }
    }

    public static int euclidGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

}
