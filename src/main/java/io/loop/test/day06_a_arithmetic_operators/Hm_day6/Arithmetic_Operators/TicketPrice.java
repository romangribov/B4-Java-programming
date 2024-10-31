package io.loop.test.day06_a_arithmetic_operators.Hm_day6.Arithmetic_Operators;

/*
Task #4 - TicketPrice
Create a class called TicketPrice in your
Practice_Programming project and inside the
day06_tasks package
Task:

add main method

declare two variables and assign

city1 = "Chicago"
city2 = "Virginia"
base ticket price = 110.50
miles between cities = 739.8
ticket price = add to the base

ticket price by dividing miles by 10

Example output:
The ticket price from
city1 to city2 is $ticketPrice"
 */

public class TicketPrice {

    public static void main(String[] args) {

        String city1 = "Chicago";
        String city2 = "Virginia";

        double baseTicketPrice = 110.50;
        double milesBetweenCities = 739.8;
        int miles = 10;
        int ticketPrice = (int) (baseTicketPrice + milesBetweenCities / miles);
        System.out.println("Ticket Price from " +city1 + " to " + city2 + " is $"+ ticketPrice);




    }
}
