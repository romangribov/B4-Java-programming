package io.loop.test.day06_a_arithmetic_operators.Hm_day6.Arithmetic_Operators;

/*
Task #2 - GiftCard
Create a class called GiftCard in your
Practice_Programming project and inside the
day06_tasks package
Task:
add main method
-Declare variables for gift card
balance, item1 price, item2 price and give
them values 200, 40, 100 respectively

-Decalare a variable for remaining
gift card balance and calculate it based on
the information above

-Print out the following:

"The gift card started with a
balance of $xxx and after buying item1 for
$xxx and item2 for $xxx,

the remaining balance of the

gift card is $xxx"

Note: use the variables for the

appropriate places.
 */

public class GiftCard {

    public static void main(String[] args) {

        int balance = 200;
        int item1 = 40;
        int item2 = 100;
        int remaining = balance - item1 - item2;
        System.out.println("The gift card started with a balance of $" + balance + "" +" and after buying item1 for " + "$" +item1+ " and item2 for $" +item2+ " the remeining balance " +"of the gift card is " + "$"+remaining+"");


    }
}
