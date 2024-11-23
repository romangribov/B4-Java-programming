package io.loop.test.day12_switch_statements.hm_day12;

import java.util.Scanner;

public class PersonalInformation {

    public static void main (String [] args){

        Scanner keyboard = new Scanner(System.in);
        String name, city, animal;
        int people, num;

        System.out.println("What is your name?");
        name = keyboard.nextLine();

        System.out.println("How many people you live with " + name + " ");
        people = keyboard.nextInt();

        if (people <= 2){
            System.out.println(name + " Lives with less than 2 people");
        }
        else if (people <= 6){
            System.out.println(name + " Lives with 3 - 6 people");
        }
        else
            System.out.println(name + " Lives with more than 6 people");

        System.out.println("What city do you live in");
        city = keyboard.nextLine();

        keyboard.nextLine();
        System.out.println("Do you live in downtown of Fairfax?: (Yes or No)");
        keyboard.nextLine();

        System.out.println("Have you thought about moving to the suburbs?: (Yes or No)");
        keyboard.nextLine();

        System.out.println("Do it. It's Great!! ");

        System.out.println("What is your favorite animal?: ");
        animal = keyboard.nextLine();

        System.out.println("Wow Horse is great animal.");
        System.out.println("How many horses would you like to have?: ");
        num = keyboard.nextInt();

        System.out.println("Interesting, you want " + num + " Horses");
        keyboard.nextLine();

        System.out.println("\nOUTPUT:\n\tThere was COVID - 19 ");

    }

}