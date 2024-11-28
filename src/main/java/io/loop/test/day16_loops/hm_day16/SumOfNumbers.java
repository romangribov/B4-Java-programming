package io.loop.test.day16_loops.hm_day16;
/*
Task #5 - SumOfNumbers

    Create a class called SumOfNumbers in your Practice_Programming project and inside the day16_tasks package

        Task:
                    Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
                        hint: you need an infinite loop
 */

import java.util.Scanner;

public class SumOfNumbers {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int sum = 0;


            while (true) {
                System.out.print("Enter a number (negative number to stop): ");
                int number = scanner.nextInt();


                if (number < 0) {
                    break;
                }


                sum += number;
            }

            System.out.println("The sum of the numbers is: " + sum);
        }
    }


