package day17_tasks;

import java.util.Scanner;

public class MoodRing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the color of your mood ring (pink, blue, orange, red): ");
        String color = scanner.nextLine().toLowerCase();


        String mood = "";
        int budget = 0;


        switch (color) {
            case "pink":
                mood = "happy";
                budget = 200;
                break;
            case "blue":
                mood = "relaxed";
                budget = 150;
                break;
            case "orange":
                mood = "nervous";
                budget = 50;
                break;
            case "red":
                mood = "angry";
                budget = 0;
                break;
            default:

                System.out.println("Invalid color entered.");
                return;
        }


        System.out.println("Mood: " + mood);
        System.out.println("Suggested shopping budget: $" + budget);
    }
}
