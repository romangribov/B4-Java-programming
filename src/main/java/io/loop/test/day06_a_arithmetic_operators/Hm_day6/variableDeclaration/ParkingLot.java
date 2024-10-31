package io.loop.test.day06_a_arithmetic_operators.Hm_day6.variableDeclaration;

/*
Task #1 - ParkingLot
Create a class called ParkingLot in your
Practice_Programming project and inside the
day06_tasks package
Task:
create a main method
-Declare variable cars and
assign a value 10
-Print out "There are 10 cars
in the parking lot"

-Print out an empty line
-Then print out "2 more cars

drive in"

-Reassign cars to a value that

the amount increase by 2

(Hint you can either add
2 with arithmetic operator and reassign or
you can use the increment operator. Note:

each increment increases it by one)

-Now, print out "There are 8

cars in the parking lot"

-Then 5 cars lefts. So
reassign the cars to the new value

-Then print out "There are xx

cars left in the parking lot
 */

public class ParkingLot {

    public static void main(String[] args) {

        int cars = 10;
        System.out.println("There are " +cars+ "cars in the parking lot");
        System.out.println();
        cars = ++cars;
        System.out.println(cars);
        cars++;
        System.out.println(cars);
        System.out.println("Then print out 2 more cars drive in");
        cars = --cars;
        System.out.println(cars);
        cars--;
        System.out.println(cars);
        cars--;
        cars--;
        System.out.println("There are "+cars+" cars in the parking lot");
        cars--;
        cars--;
        cars--;
        cars--;
        cars--;
        System.out.println("There are " +cars+ " cars left in the parking lot");



    }
}
