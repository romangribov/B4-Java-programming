package io.loop.test.day04_variables.Hm_day4;

/*
Task #2 - Olymics

    Create a class called Olymics in your Practice_Programming project and inside the day04_tasks package

        Task:
            Create a main method
            create a variable for the year
            print the country and year for next couple events reassigning year value each time.

            Country name is hard coded
            Info:
                China 2022
                France 2024
                Italy 2026

            Example Output
                Look forward to the year 2002 for the Olympics to be in China

 */

public class Olymics {

    public static void main(String[] args) {
        int year = 2022;



        System.out.println();

        System.out.println("Look forward to the year for the Olympics to be in China" + "\t"+year);

        year = year +2;

        System.out.println("Look forward to the year for the Olympics to be in France" + "\t"+year);

        year = year +2;


        System.out.println("Look forward to the year for the Olympics to be in Italy" + "\t"+year);

    }
}
