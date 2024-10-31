package io.loop.test.day06_a_arithmetic_operators.Hm_day6.Arithmetic_Operators;

/*
Task #1 - CalculateAge
Create a class called CalculateAge in
your Practice_Programming project and inside
the day06_tasks package
Task:
create a main method
-Declare variables for the year of
birth and the current year

-Declare the third variable to

calculate the age

With a print statement to print out

"Your age: $age"

Note: all the variables have the
same data type, So, try to declare and assign
with declaring one data type
 */

public class CalculateAge {

    public static void main(String[] args) {

        int birth = 1995;
        int now = 2024;
        int total = now - birth;
        System.out.println("Your age: "  + now + - birth);
        System.out.println("Your age: " +total);


    }
}
