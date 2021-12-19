package src;

import java.util.Scanner;

public class CalculateMealPrice {
    public static void calculateMealPrice(
        double listedMealPrice,
        double tipRate,
        double taxRate
    ) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double total = listedMealPrice + tip + tax;

        System.out.println("Your total meal price is: " + total);
    }

    public static void main(String[] args) {
        calculateMealPrice(15, .2, .08);
    }
}
