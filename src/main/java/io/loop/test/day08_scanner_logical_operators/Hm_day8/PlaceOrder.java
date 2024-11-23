package io.loop.test.day08_scanner_logical_operators.Hm_day8;

/*

Task #5 - PlaceOrder (Hard Task)

    Create a class called PlaceOrder in your Practice_Programming project and inside the day08_tasks package

        Task:
		create a main method
		create a Scanner object
		Ask the user the "enter the product name: " (String, multiple words)
		Ask the user to "enter the price: $" (double)
		Ask the user to "enter the quantity: " (int)
		Ask the user to "enter their full name: " (String, multiple word)
		Print in the following format:
        		"$firstName, your order for $quantity $productName has been placed. Your total is $totalCost(price * quantity)."

		Ex:
        		Input: "Apples" , 1.5, 5. "Luke"
        		Output: Luke, your order for 5 Apples has been placed. Your total is 7.5.
 */

import java.util.Scanner;

public class PlaceOrder {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
//        System.out.println("enter the product name:");
        String firstName = "Luke";
        System.out.println("enter the price:");
        double price = key.nextInt();
        System.out.println();
        System.out.println("enter the quantity:");
        int quantity = key.nextInt();
//      System.out.println("enter their fullName");
        String productName = "Yogurt";
        System.out.println(firstName+" your order for " + quantity +" "+ productName +" been placed "+ "Your total is "+(price * quantity));

    }
}
