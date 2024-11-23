package io.loop.test.day11_if_statements.hm_day11;

import java.util.Scanner;

/*
Task #2 - RealEstate

    Create a class called RealEstate in your Practice_Programming project and inside the day10_a_tasks package

        Task:
                        We are buying a house
                        ask the user for their budget (single number, max)

                        Find the area that the user's budget fits into and provide all the information of the neighborhood

                        extra condition:
				if the user gives a budget value below 0, it is invalid, so print: "That is not a valid budget".
				If the budget is more than 300,000 print "Too much money for this agency"

                        Data based on neighborhood name:
                            name - Hills
                            average price - 80,000 - 100,000
                            rating - 4.0
                            gated - no
                            allow pets - yes

                            name - Oaks
                            average price - 55,000 - 75,000
                            rating - 3.5
                            gated - no
                            allow pets - yes

                            name - Highland
                            average price - 120,000 - 150,000
                            rating - 4.5
                            gated - yes
                            allow pets - no

                            name - Canyon
                            average price - 160,000 - 201,000
                            rating - 4.8
                            gated - yes
                            allow pets - yes

                            If the budget is no in any range print: "No available houses"

 */
public class RealEstate {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        double budget = key.nextDouble();
        boolean notInRange = budget >= 55000 || budget <= 201000;
        boolean hills = budget >= 80000 && budget <= 100000;
        boolean oaks = budget >= 55000 && budget  <= 150000;
        boolean highland = budget >= 120000 && budget <= 150000;
        boolean canyon = budget >= 160000 && budget <= 201000;


        if (budget >= 300000) {
            System.out.println("Too much money for this agency" );
        } else if (budget <= 0) {
            System.out.println("That is not a valid budget" );
        } else if (hills) {
            System.out.println("\t\nName - Hills\n" + "\t\taverage price - 80,000 - 100,000\n" + "\t\trating - 4.0\n" + "\t\t - no\n" + "allow pets - yes");
        } else if (oaks) {
            System.out.println("\t\nName - Hills\n" + "\t\taverage price - 55,000 - 100,000\n" + "\t\trating - 3.5\n" + "\t\t - no\n" + "allow pets - yes");
        } else if (highland) {
            System.out.println("\t\nName - Hills\n" + "\t\taverage price - 120,000 - 100,000\n" + "\t\trating - 4.5\n" + "\t\t - no\n" + "allow pets - no");
        } else if (canyon) {
            System.out.println("\t\nName - Hills\n" + "\t\taverage price - 160,000 - 201,000\n" + "\t\trating - 4.8\n" + "\t\t - no\n" + "allow pets - yes");
        } else if (notInRange) {
            System.out.println("No available houses");
        }

    }
}
