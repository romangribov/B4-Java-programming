package day17_tasks;

import java.util.Scanner;

public class CreateID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();


        if (firstName.length() < 1 || lastName.length() < 1) {
            System.out.println("Invalid input. Please enter non-empty names.");
        } else {

            char firstLetterFirstName = Character.toLowerCase(firstName.charAt(0));


            String firstThreeLettersLastName = lastName.length() >= 3
                    ? lastName.substring(0, 3)
                    : lastName;
            firstThreeLettersLastName = firstThreeLettersLastName.substring(0, 1).toUpperCase()
                    + firstThreeLettersLastName.substring(1).toLowerCase();


            int lengthOfFirstNameMultipliedByTwo = firstName.length() * 2;


            String id = "" + firstLetterFirstName + firstThreeLettersLastName + lengthOfFirstNameMultipliedByTwo;

           
            System.out.println("Generated ID: " + id);
        }
    }
}
