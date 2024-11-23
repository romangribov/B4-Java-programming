package io.loop.test.day08_scanner_logical_operators.Hm_day8;

/*
Task #6 - RateCalculator

    Create a class called RateCalculator in your Practice_Programming project and inside the day08_tasks package

        Task:
		create a main method
		create a Scanner object

		Ask the user to "enter a salary $"(double)
		Print the hourly rate (double) of the employee
			assume that one year has 52 weeks
    			hourRate = salary / (weeklyHour * 52)

		Output:
			"Hourly rate of the employee: $hourlyRate"
 */

import java.util.Scanner;

public class RateCalculator {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("enter a salary $");
        int salary = key.nextInt();
       // double hourRate = 22.4;
        int weeklyHour = 40;
        double hourRate = salary / (weeklyHour * 52);

        System.out.println(hourRate);

    }
}
