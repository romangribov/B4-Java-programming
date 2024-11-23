package io.loop.test.day09_a_scanner.Hm_day9;

/*
Task #1 - Divisible

    Create a class called Divisible in your Practice_Programming project and inside the day08_tasks package

        Task:
            	create a main method
		create a main method
		create a Scanner object
		Ask the user to enter a number. Check if that number is evenly divisible by 2, 3, and 5. Print the boolean values


		Ex:
    			Enter a number
    			65

    			65 is divisible by 2: false
    			65 is divisible by 3: false
    			65 is divisible by 5: true

            			Hint: Use escape sequences

 */

import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter number");
        int num1 = key.nextInt();
        boolean num = num1 / 2 == 0;
        System.out.println(num);
        System.out.println("Enter number");
        int num2 = key.nextInt();
        num = num2 / 3 == 0;
        System.out.println(num);
        System.out.println("Enter number");
        int num3 = key.nextInt();
        num = num3 / 5 == 13;
        System.out.println(num);



    }
}
