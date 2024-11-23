package io.loop.test.day10_if_statements.hm_day10;
/*
Task 1 - GiftCard (Relit - Gift Card 2)

    Create a class called GiftCard in your Practice_Programming project and inside the day10_tasks package

        Task:
		Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

		If item is not in the list, display message: "Invalid item!".
		If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
		List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$

		Hint: if/ else if / else or switch statement

		Examples:

		input: Hat
		output:
			Thank you for your purchase!
			Your current balance is: 75$

		input: Pants
		output:
			Thank you for your purchase!
			Your current balance is: 50$

		input: Laptop
		Output:
			Sorry, not enough funds on your gift card!

		input: Cupcake
		output: Invalid item!

 */

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int price = 100;
        price = key.nextInt();
        int Blanket = 60;
        price = key.nextInt();
        int Charger = 25;
        price = key.nextInt();
        int Hat = 25;
        price = key.nextInt();
        int Headphones = 30;
        price = key.nextInt();
        int LapTop = 200;
        price = key.nextInt();
        int Pants = 50;
        price = key.nextInt();
        int Pillow = 40;
        price = key.nextInt();
        int Smartphone = 1000;
        price = key.nextInt();
        int Socks = 5;
        price = key.nextInt();
        int Usb_cable = 10;
        price = key.nextInt();
        int total = price *= price;

        if (Blanket < price && Charger < price && 25 < price && Headphones < price && LapTop < price && Hat < price && Pants < price && Pillow < price);

     else if
        (Smartphone < price);
     else if   (Socks < price && Usb_cable <= price);

        System.out.println();
        System.out.println("Thank you for your purchase! Your current balance is: 75$");
        System.out.println("Thank you for your purchase! Your current balance is: 50$");
        System.out.println("Sorry, not enough funds on your gift card!");
        System.out.println("Invalid item!");




    }
}
