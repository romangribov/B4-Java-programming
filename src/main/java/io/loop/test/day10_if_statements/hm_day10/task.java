package io.loop.test.day10_if_statements.hm_day10;

import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How old are you? Enter your age:");
        int age = key.nextInt();

        if (30 <= age && age <= 50) {
            System.out.println("My age "+ age);
        }
        else if (51 <= age && age <= 70)
        System.out.println("yanger a then me :" + age);

        else
            System.out.println("Error message");

    }
}
