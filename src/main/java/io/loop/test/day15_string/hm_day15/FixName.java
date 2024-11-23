package io.loop.test.day15_string.hm_day15;
/*
Task #8 - FixName

    Create a class called FixName in your Practice_Programming project and inside the day15_tasks package

        Task:
                Given a enters first name and then last name

		Fix to print proper name:
        		capital first letter, the rest of the letter lowercase,  no extra space

          	Ex:
			Enter your first name
			jaMES
			"Enter your last name"
			boND

			Output:
				Your full name: James Bond
 */

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();


        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();


        String fixedFirstName = fixName(firstName);


        String fixedLastName = fixName(lastName);


        System.out.println("Your full name: " + fixedFirstName + " " + fixedLastName);
    }


    public static String fixName(String name) {

        if (name != null && name.length() > 0) {

            String fixedName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            return fixedName;
        }
        return "";
    }
}
