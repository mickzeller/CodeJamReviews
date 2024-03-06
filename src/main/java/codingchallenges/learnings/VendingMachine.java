package codingchallenges.lucidchallenge;

import java.util.Scanner;

public class VendingMachine {

    static int PENNIES_PER_DOLLAR = 100;
    static int PENNIES_PER_QUARTER = 25;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int billValue;
        int itemPrice;

        System.out.println("Enter bill value: $1, $2, $5, $10");
        billValue = input.nextInt();

        System.out.println("Enter item price in pennies");
        itemPrice = input.nextInt();

        purchaseItem(billValue, itemPrice);
    }


    private static void purchaseItem(int billValue, int itemPrice) {

        int amountDue = PENNIES_PER_DOLLAR * billValue - itemPrice;
        int dollarCoins = amountDue / PENNIES_PER_DOLLAR;
        amountDue = amountDue % 100;
        int quarters = amountDue / PENNIES_PER_QUARTER;

        System.out.printf("You have %d dollar coins and %d quarters", dollarCoins, quarters);

    }

}
