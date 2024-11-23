package io.loop.test.day10_if_statements.hm_day10;

import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the month (number from 1 to 12 or month name with proper capitalization):");
        String input = scanner.nextLine();

        int days = 0;


        if (input.equals("1") || input.equals("January") || input.equals("Jan")) {
            days = 31;
        } else if (input.equals("2") || input.equals("February") || input.equals("Feb")) {
            days = 28;
        } else if (input.equals("3") || input.equals("March") || input.equals("Mar")) {
            days = 31;
        } else if (input.equals("4") || input.equals("April") || input.equals("Apr")) {
            days = 30;
        } else if (input.equals("5") || input.equals("May")) {
            days = 31;
        } else if (input.equals("6") || input.equals("June") || input.equals("Jun")) {
            days = 30;
        } else if (input.equals("7") || input.equals("July") || input.equals("Jul")) {
            days = 31;
        } else if (input.equals("8") || input.equals("August") || input.equals("Aug")) {
            days = 31;
        } else if (input.equals("9") || input.equals("September") || input.equals("Sep")) {
            days = 30;
        } else if (input.equals("10") || input.equals("October") || input.equals("Oct")) {
            days = 31;
        } else if (input.equals("11") || input.equals("November") || input.equals("Nov")) {
            days = 30;
        } else if (input.equals("12") || input.equals("December") || input.equals("Dec")) {
            days = 31;
        } else {
            System.out.println("Invalid month name or number");
        }

        if (days > 0) {
            System.out.println(days + " days");
        }


    }
}
