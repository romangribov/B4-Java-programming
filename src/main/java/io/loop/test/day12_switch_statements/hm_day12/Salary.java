package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #9 - Salary

    Create a class called Salary in your Practice_Programming project and inside the day12_tasks package

        Task:
    		Given the following information:
				hourly rate,
                              	weekly hours,
                                and number of weeks.
    		Check if all the inputs are valid and then calculate the salary.
        		-hourly rate cannot be negative or zero
            			-> If invalid print: Hourly Rate cannot be Negative or Zero
        		-weekly hours cannot be zero, negative or more than 65
            			-> If invalid print: Weekly Hours cannot be less than 1 or greater than 65
        		-number of weeks cannot be less than 1 and more than 52
            			-> If invalid print: Number of weeks cannot be less than 1 or greater than 52

        		Note: Equation: salary  =  hourly rate *  weekly hours * number of weeks

			Note: You need think of the cases the user put wrong input


        	Ex:
        		Enter hourly rate $:
            		65
			Enter your weekly hours:
			40
`			Enter the number of weeks worked:
			50
			Salary: $__



 */

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int hourlyRate;
        int weeklyHours;
        int numOfWeeks;

        System.out.println("Enter your hourly rate: ");
        hourlyRate = keyboard.nextInt();
        System.out.println("Enter your weekly hours: ");
        weeklyHours = keyboard.nextInt();
        System.out.println("Enter number of weeks that you have worked: ");
        numOfWeeks = keyboard.nextInt();

        double salary = hourlyRate * weeklyHours * numOfWeeks;

        if (hourlyRate > 0) {

        }
        else
            System.out.println("Hourly Rate cannot be Negative or Zero");

        if (weeklyHours > 0 && weeklyHours <= 65) {

        }
        else
            System.out.println("Weekly Hours cannot be less than 1 or greater than 65");

        if (numOfWeeks >= 1 && numOfWeeks <= 52) {

        }
        else
            System.out.println("Number of weeks cannot be less than 1 or greater than 52");

        if ((hourlyRate > 0) && (weeklyHours > 0 && weeklyHours <= 65) && (numOfWeeks > 0 && numOfWeeks <= 52)) {
            System.out.println("\nSalary\n\t" + salary);
        }

    }

}