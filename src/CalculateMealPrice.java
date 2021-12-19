package src;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateMealPrice {
    public static double calculateMealPrice(
        double listedMealPrice,
        double tipRate,
        double taxRate
    ) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return listedMealPrice + tip + tax;
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static double getIndividualPayment(double total, int people) {
        return total / people;
    }

    public static void main(String[] args) {
        double totalMealPrice = calculateMealPrice(530, .2, .08);
        double splitPayment = getIndividualPayment(totalMealPrice, 3);
        
        System.out.println("Total Meal Price: " + totalMealPrice);
        System.out.println("Individual payment: " + df.format(splitPayment));
    }
}
