package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #4 - HouseOccupants

    Create a class called HouseOccupants in your Practice_Programming project and inside the day12_tasks package

        Task:
     		Given a house type (String) print out the number of max occupants (int)

        		Tree house: 1
        		Mobile home: 2
        		Apartment: 4
        		Town house: 6
        		Villa: 8
        		Mansion: 10

            	-> Try to use variables instead of printing multiple times

		Hint: You can use switch


        	Ex:
        		Enter the type of the hose to see the max allowed occupants number.
            		Town house

            		OUTPUT:
				There are 6 people in the Town house
 */

import java.util.Scanner;

public class HouseOccupants {
    public static void main(String[] args) {
        Scanner house = new Scanner(System.in);
        int num = house.nextInt();
        int tree_House = 1;
        int mobile_Home = 2;
        int apartment = 4;
        int town_House = 6;
        int villa = 8;
        int mansion = 10;

        switch (num) {
            case 1:
                System.out.println("There are 1 people in the Tree House");
                break;
            case 2:
                System.out.println("There are 2 people in the Mobile Home");
                break;
            case 4:
                System.out.println("There are 4 people in the Apartment");
                break;
            case 6:
                System.out.println("There are 6 people in the Town House");
                break;
            case 8:
                System.out.println("There are 8 people in the Villa");
                break;
            case 10:
                System.out.println("There are 10 people in the Mansion");
        }

    }
}
