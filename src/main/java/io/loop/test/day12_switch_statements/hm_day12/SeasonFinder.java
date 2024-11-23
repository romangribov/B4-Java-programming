package io.loop.test.day12_switch_statements.hm_day12;

/*
Task #1 - SeasonFinder

    Create a class called SeasonFinder in your Practice_Programming project and inside the day12_tasks package

        Task:
    		add a main method

    		Given some month number determine which season it is

    		Winter: 12,1,2
    		Spring: 3,4,5
    		Summer: 6,7,8
    		Fall:   9,10,11

        	Ex:
        		when month = 2;
            		OUTPUT:
                		"Winter"

        		when month = 7;
            		OUTPUT:
                		"Summer"
 */

public class SeasonFinder {
    public static void main(String[] args) {

        int month = 5;
//        month = 12;
//        month = 2;
//
//
//        month = 6;
//        month = 7;
//        month = 8;
//
//        month = 9;
//        month = 10;
//        month = 11;

        switch (month) {
            case 1: //12,1,2
                System.out.println("This is winter" );
                break;
            case 2: //3,4,5
                System.out.println("This is spring" );
                break;
            case 3: //6,7,8
                System.out.println("This is Summer" );
                break;
            case 4: //9,10,11
                System.out.println("This is Fall" );
                break;
            case 5:
                System.out.println("This is Fall");
                break;
            case 6:
                System.out.println("This is Summer");
                break;
            case 7:
                System.out.println("This is Summer");
                break;
            case 8:
                System.out.println("This is Summer");
                break;
            case 9:
                System.out.println("This is Fall");
                break;
            case 10:
                System.out.println("This is Fall");
                break;
            case 11:
                System.out.println("Thi is Fall");
                break;
            case 12:
                System.out.println("This is Winter");
                break;


        }

    }
}
