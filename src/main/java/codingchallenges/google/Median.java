package codingchallenges.google;

public class Median {

    public static void main(String[] args) {
        int[] array1 = {2, 3, 5, 7, 11, 13};
        int[] array2 = {4, 6, 8, 9, 10, 12};
        System.out.println(checkToSquareRootOfN(1999));


    }


    private static boolean checkToSquareRootOfN(int n) {
        if (n < 2) {
            return false;
        }

        int squareRootOfN = (int) Math.sqrt(n);
        for (int i = 2; i < squareRootOfN; i++) {
            System.out.println(i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
