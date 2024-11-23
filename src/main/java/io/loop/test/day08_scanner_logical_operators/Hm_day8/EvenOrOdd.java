package io.loop.test.day08_scanner_logical_operators.Hm_day8;
/*
Task #2 - EvenOrOdd

    Create a class called EvenOrOdd in your Practice_Programming project and inside the day08_tasks package

        Task:
		create a main method
		create a Scanner object
		Ask the user to enter an int number, print if the number is even or odd as boolean values

		Ex:
    			Enter an int number
    			65

    			65 is even: false
    			65 is odd: true
 */

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter an int number");
        System.out.print("\tNumber 65: ");
        int even = key.nextInt();
        System.out.println("Enter an int number");
        System.out.print("\tNumber 65: ");
        int odd = key.nextInt();
        boolean result = even == odd;
        System.out.println("\n\tIs " + even + " is even " + odd + " is odd " + result);
        System.out.println("\n\tIs odd " + odd +" " + result);



    }
}
