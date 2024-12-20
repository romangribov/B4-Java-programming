package io.loop.test.day24_methods.hm_day24;
/*
Task #3 - MethodPractice3


        Task:
                create a method that will accept a number. Find and print if it is a
		positive number, negative number, or zero
 */
import java.util.Scanner;

public class MethodPractice3 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Enter your number:");
        int num = key.nextInt();
        isPosOrNegOrZero(num);
    }

    public static void isPosOrNegOrZero(int num) {
        if (num > 0) {
            System.out.println("Your number is Positive");
        } else if (num < 0) {
            System.out.println("Your number is Negative");
        } else {
            System.out.println("Your number is Zero");
        }
    }
}
