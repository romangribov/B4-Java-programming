package io.loop.test.day10_if_statements.hm_day10;


import java.util.Scanner;

public class AgeGroup {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("Invalid entry");
        } else if (age < 1) {
            System.out.println("Infant");
        } else if (age >= 3 && age <= 5) {
            System.out.println("Toddler");
        } else if (age >= 6 && age <= 9) {
            System.out.println("Kid");
        } else if (age >= 10 && age <= 12) {
            System.out.println("Pre-Teen");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 20) {
            System.out.println("Young Adult");
        } else if (age >= 21 && age <= 35) {
            System.out.println("Adult");
        } else if (age >= 36 && age <= 55) {
            System.out.println("Middle-Aged Adult");
        } else {
            System.out.println("Senior Citizen");
        }

    }
}
