package io.loop.test.day06_a_arithmetic_operators.Hm_day6.Arithmetic_Operators;
/*
Task #3 - Pizza

Create a class called Pizza in your
Practice_Programming project and inside the
day06_tasks package
Task:

add main method
declare two variables and assign

pizza = "cheese"
pizza slices = 8
people = 4
calculate the slices per
person
Example output:
We ordered cheese pizza
with 8 slices, 4 people ate 2 slices each
 */

public class Pizza {

    public static void main(String[] args) {

        String pizza = "Cheese";
        int slices = 8;
        int people = 4;
        int division = slices / people;
        System.out.println("We ordered cheese pizza with 8 slices, 4 people ate " +division+  " slices each");




    }
}
