package io.loop.test.day10_if_statements.hm_day10;

import java.util.Scanner;

public class GradeScale {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the percentage:");
        int percentage = scanner.nextInt();

        // Многоуровневые if-else условия для определения оценки
        if (percentage >= 85 && percentage <= 100) {
            System.out.println("Grade: A");
        } else if (percentage >= 70 && percentage <= 84) {
            System.out.println("Grade: B");
        } else if (percentage >= 55 && percentage <= 69) {
            System.out.println("Grade: C");
        } else if (percentage >= 40 && percentage <= 54) {
            System.out.println("Grade: D");
        } else if (percentage >= 0 && percentage < 40) {
            System.out.println("Grade: F");
        } else {
            System.out.println("Invalid percentage, no grade");
        }

        scanner.close();
    }
}
