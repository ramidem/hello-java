package src;

import java.util.Scanner;

public class AnnounceDeveloperTeaTime {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for Developer Tea Time...");
        System.out.println("Type in a random work and press Enter to start developer tea time.");

        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");
    }
  
    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

}
