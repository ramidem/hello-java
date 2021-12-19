package src;

import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Please input a number between 1 and 10");

        Scanner scanner = new Scanner(System.in);
        int pickedNumber = scanner.nextInt();

        if (pickedNumber < 5) {
            System.out.println("Enjoy the good luck a friend brings you.");
        } else {
            System.out.println("Your shoe selection will make you happy today.");
        }
    }
}
