package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #10- FieldTrip

    Create a class called FieldTrip in your Practice_Programming project and inside the day12_tasks package

        Task:

             	Your school goes on a Field trip each year.
		The place you go will be based on your grade. Based on the grade level (1-6) figure out the details of your field trip.
		Print the information at the end.

               	declare and assign the grade level variable

                only check for the data for valid grades which are only grades values from 1-6. Less than 1 and more than 6 is invalid,
                            so print: "Grade must be between 1-6"

                        Data based on grade:
                            grade - 1
                            location -  Apple orchard
                            number of groups - 3
                            teacher in charge - Ms. Smith

 */

import java.util.Scanner;

public class FieldTrip {

        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            String teacher, location;
            int numOfGroups;
            int grade;

            System.out.println("Enter your grade level for field trip: ");
            int gradeLevel = keyboard.nextInt();

            if (gradeLevel == 1) {
                System.out.println("\tGrade: 1\n\tLocation: Apple Orchard\n\tNumber Of Groups: 3\n\tTeacher In Charge: Ms.Smith ");
            } else if (gradeLevel == 2) {
                System.out.println("\tGrade: 2\n\tLocation: Disney World\n\tNumber Of Groups: 5\n\tTeacher In Charge: Mr. Hill ");
            } else if (gradeLevel == 3) {
                System.out.println("\tGrade: 3\n\tLocation: Zoo\n\tNumber Of Groups: 4\n\tTeacher In Charge: Mr.Adi ");
            } else if (gradeLevel == 4) {
                System.out.println("\tGrade: 4\n\tLocation: Soccer Game\n\tNumber Of Groups: 6\n\tTeacher In Charge: Mr.Tom ");
            } else if (gradeLevel == 5) {
                System.out.println("\tGrade: 5\n\tLocation: Movie Theater\n\tNumber Of Groups: 2\n\tTeacher In Charge: Ms.Hailey ");
            } else if (gradeLevel == 6) {
                System.out.println("\tGrade: 6\n\tLocation: Aquarium\n\tNumber Of Groups: 3\n\tTeacher In Charge: Ms. Tiffany ");
            } else {
                System.out.println("Grade must be between 1-6");
            }

        }

    }

