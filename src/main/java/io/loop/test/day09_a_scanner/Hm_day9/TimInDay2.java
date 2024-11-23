package io.loop.test.day09_a_scanner.Hm_day9;

/*
Task #6 - TimInDay

    Create a class called TimInDay in your Practice_Programming project and inside the day09_tasks package

        Task:

		Write a Java program to implement following logic using if statement
        		1. if hour is less than 12 noon, greet with Good Morning
        		2. if hour is greater than or equal 12 noon but less than 3 pm, greet with Good Afternoon
        		3. if hour is greater than or equal to 3 pm, greet with Good Evening
        		4. if not in between time zone print invalid  // I added this. Was not in the question.


		Note: Use Scanner class / write all the conditions to cover all the possibilities for the different input

		Example Output:
			What time is it now (put between 0 and 24 only)?
			-1
			Invalid input!
 */

import java.util.Scanner;

public class TimInDay2 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the hour in 24-hour format (0-23): ");
        int hour = key.nextInt();

        if (hour <= 12 && hour < 12) {
            System.out.println("Good morning");
        } else if (hour >= 12 && hour < 15) {
            System.out.println("Good afternoon");
        } else if (hour >= 15 && hour <= 23) {
            System.out.println("Good evening");
        } else {
            System.out.println("invalid hour");
        }

    }
}

