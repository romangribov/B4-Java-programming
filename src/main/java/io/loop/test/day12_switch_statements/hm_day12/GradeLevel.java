package io.loop.test.day12_switch_statements.hm_day12;

/*
Task #3 - GradeLevel

    Create a class called GradeLevel in your Practice_Programming project and inside the day12_tasks package

        Task:
    		    Given a grade level (byte) determine and print which school level someone is in.

        		1-5: Elementary school
        		6-8: Middle school
        		9-12: High school
        		13-16: College
        		17-18: Grad School
        		Other: Invalid grade level given

		Hint: You can use it else


        	Ex:
        		Enter a grade level to see which school level someone is in.
            		18

            		OUTPUT:
                		Grad School
 */

import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        Scanner school = new Scanner(System.in);
        int num = school.nextInt();

        if (num >= 1 && num <= 5) {
            System.out.println("Elementary School");
        } else if (num >= 6 && num <= 8) {
            System.out.println("Middle school");
        } else if
        (num >= 9 && num <= 12) {
            System.out.println("High school");
        } else if
        (num >= 13 && num <= 16) {
            System.out.println("College");
        } else if
        (num >= 17 && num <= 18) {
            System.out.println("Grad School");
        } else if
        (num >= 19 && num <= 21) {
            System.out.println("Invalid grade level given");
        }

    }
}







