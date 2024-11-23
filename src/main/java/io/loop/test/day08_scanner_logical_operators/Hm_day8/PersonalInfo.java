package io.loop.test.day08_scanner_logical_operators.Hm_day8;
/*
Task #4 - PersonalInfo

    Create a class called PersonalInfo in your Practice_Programming project and inside the day08_tasks package

        Task:
		create a main method
		create a Scanner object

    		Ask the user to enter their age (byte),
    		ask them to enter their favorite number (long),
    		Calculate and assign to boolean variable if the age is equal and bigger than 18 AND equal and small than 25

    		Print all the values from the inputs


		Ex:
    			Enter your age:
    			30
			Enter your favorite number:
			7
			You are a student:
			false

 */

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = key.nextInt();
        age = (byte) 30;
        System.out.println("Enter your favorite number:");
        long favorite = key.nextInt();
        boolean areNumsEqual = age >= 18 && age <= 25;
        System.out.println("You are a student:"+areNumsEqual);








    }
}
