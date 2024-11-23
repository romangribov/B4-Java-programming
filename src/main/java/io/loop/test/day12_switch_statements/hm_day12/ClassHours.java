package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #6 - ClassHours

    Create a class called ClassHours in your Practice_Programming project and inside the day12_tasks package

        Task:
    		Given some Day(String) print out the office hours schedule for that day if there is office hours.
        		Monday:
            			Print: Mentor Hours
        		Tuesday:
			Friday:
				Print: No Class
			Wednesday:
			Thursday:
			Saturday:
            			Print: Java Class
        		Sunday:
				Print: Soft skills
        		Any other String:
            			Print: Invalid day given


			Note: You need think of the cases the user put wrong input


        	Ex:
        		Enter the day of the week:
            		Wednesday

            		OUTPUT:
				Java Class
 */

import java.time.MonthDay;
import java.util.Scanner;

public class ClassHours {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the day of the week:");
        String day = key.nextLine();
//        String1 days;
//        String2 monday;
//        String tuesday;
//        String wednesday;
//        String thursday;

        switch (day) {
            case "Monday":
                System.out.println("Mentor Hours");
                break;
            case "Tuesday":
            case "Friday":
                System.out.println("No Class");
                break;
            case "Wednesday":
            case "Thursday":
            case "Saturday":
                System.out.println("Java Class");
                break;
            case "Sunday":
                System.out.println("Soft Skills");
                break;
            default:
                System.out.println("Invalid day given");
                break;


        }
    }
}