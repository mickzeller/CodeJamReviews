package main.codingchallenges.hackerleet;


public class PrimeCheck {

    public int gaussianPrime() {
        //4n+3
        int number = 0;
        for (int i = 1; i < 1000; i++) {
            number = (4 * i) + 3;
        }
        return number;
    }

    public int[] toArray(int num) {
        int[] array = new int[Integer.toString(num).length()];
        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = num % 10;
            num = num / 10;
        }
        return array;
    }

    public int digitSum(int n) {
        int t = n % 10;
        System.out.println("t : " + t + " n : " + n + " n / 10 + t -> " + ((n / 10) + t));
        if (n == 0) {
            return 0;
        }
        return digitSum(n / 10) + t;
    }

    // go to 36
    public boolean[] seivePrimes(int n) {
        boolean[] a = new boolean[(int) Math.sqrt(n)];
        int checkTo = (int) Math.sqrt(n);
        for (int i = 2; i < checkTo; i++) {


            for (int j = 2; j < n; j++) {

                if (i % (j + 1) != 0) {
                    a[i] = true;
                    int notPrime = calculateCompositeNumbers(i, j);
                    a[notPrime] = false;
                }
            }

        }
        return a;
    }

    // i^(2) + n * i
    private int calculateCompositeNumbers(int i, int n) {
        // let n > 1
        System.out.println((int) (Math.sqrt(i) + n * i));
        return (int) (Math.sqrt(i) + n * i);
    }
}