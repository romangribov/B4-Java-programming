package day15_tasks;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        int length = input.length();


        if (length % 2 == 0) {

            String middle = input.substring(length / 2 - 1, length / 2 + 1);
            System.out.println("The middle characters: " + middle);
        } else {

            char middle = input.charAt(length / 2);
            System.out.println("The middle character: " + middle);
        }

    }
}
