package src;

import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        String prompt = "Please input a number between 1 and 10";

        Scanner scanner = new Scanner(System.in);
        boolean isOpen = true;

        while (isOpen) {
            System.out.println(prompt);
            int pickedNumber = scanner.nextInt();

            if (pickedNumber == 0) {
                isOpen = false;
            } else {
                if (pickedNumber < 5) {
                    System.out.println("Enjoy the good luck a friend brings you.");
                } else {
                    System.out.println("Your shoe selection will make you happy today.");
                }
            }
        }

        System.out.println("Exiting program.");
    }
}
