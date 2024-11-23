package io.loop.test.day08_scanner_logical_operators.Hm_day8;
/*

Task #3 - LeapYear

    Create a class called LeapYear in your Practice_Programming project and inside the day08_tasks package

        Task:
                create a main method
		create a Scanner object

		Ask the user to enter a year. Determine if the year is a leap year or not.
		You can assume a leap year is a year that is divisible by 4. Print true or false.

		Hint: use remainder operator


		Ex:
    			Enter a year
    			2000

    			The 2000 year is a Leap Year: true
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = key.nextInt();
        year = 2000;
//        System.out.println("The 2000 year is a Leap Year:");
//        int leap = key.nextInt();
        boolean leap = year % 4 == 0;
        System.out.println("The " +year + " Leap Year " + leap+"");
//        boolean yeas = leap && year
//        int reminder =
//        int afterVisionBy2 = total / 2;
       // boolean reminder = 500 %  500;

//        boolean isDivisibleBy2 = num % 2 == 0;
//        boolean isDivisibleBy3 = num % 3 == 0;
//        boolean isDivisibleBy5 = num % 5 == 0;



    }
}
