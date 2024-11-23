package io.loop.test.day08_scanner_logical_operators.Hm_day8;

/*
Task #8 - Revenue

    Create a class called Revenue in your Practice_Programming project and inside the day08_tasks package

        Task:

		create a main method
		create a Scanner object

		Ask the user to "enter product price and quantity:" (use the input twice)
		Then calculate the revenue.
    			revenue = price Ã quantity.Â

		Output:
			Revenue: $revenue
 */


import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("price and quantity:");

        int num1 = key.nextInt();
//        System.out.println("Enter PRoduct");
        int num2 = key.nextInt();
        System.out.println("Enter Price");
        int num3 = key.nextInt();
        System.out.println("Enter Quantity");
        int quantity = num1 + num2 + num3;

        int price1 = key.nextInt();
        int price2 = key.nextInt();
        int price3 = key.nextInt();
        int price = price1 + price2 + price3;

        System.out.println(quantity + price);

        int revenue = quantity + price;

        System.out.println(revenue);

    }
}
