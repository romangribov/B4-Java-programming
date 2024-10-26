package io.loop.test.day04_variables.Hm_day4;

/*
Task #1 - PrintDate

    Create a class called PrintDate in your Practice_Programming project and inside the day04_tasks package

        Task:
            Create a main method
            declare and assign 3 variables
            the month number, the day number, and year number
            print the date in the following format using concatenation:
                month/day/year

            print the date in the following format:
                month_day_year

            print the date in the following format:
                month-day-year

            print the date in the following format:
                month|day|year

            print the date in the following format:
                month<>day<>year

 */

public class PrintDate {

    public static void main(String[] args) {

        short year;                             // Declared a variable
        year = 2024;                            //
        short month;
        month = 10;
        short day;
        day = 25;

        System.out.println(year + "\\" + month + "\\" + day + "\\");
        System.out.println(day + "_" + month + "_" + year);
        System.out.println(day + "|" + month + "|" + year);
        System.out.println(day + "<>" + month + "<>" + year);



    }
}
