package io.loop.test.day16_loops.hm_day16;
/*
Task 1 - FactorialNumber

    Create a class called FactorialNumber in your Practice_Programming project and inside the day16_tasks package

        Task:
                    FactorialNumber
                    write a program that can return the factorial number of any given number
                        Ex:
                            input: !5
                            output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */

import java.util.Scanner;

public class FactorialNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the factorial in the format !n (e.g., !5):");
        String input = scanner.nextLine();


        if (input.startsWith("!") && input.length() > 1) {

            String numberString = input.substring(1);


            boolean isValidNumber = true;
            for (int i = 0; i < numberString.length(); i++) {
                if (numberString.charAt(i) < '0' || numberString.charAt(i) > '9') {
                    isValidNumber = false;
                    break;
                }
            }


            if (isValidNumber) {
                int number = Integer.parseInt(numberString);

                if (number < 0) {
                    System.out.println("Factorial is not defined for negative numbers.");
                } else {

                    long factorial = 1;
                    for (int i = 1; i <= number; i++) {
                        factorial *= i;
                    }

                    System.out.println("Factorial of " + number + " is " + factorial);
                }
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } else {
            System.out.println("Invalid input. Please enter in the format !n.");
        }
    }
}
