package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #5 - MorningOrNight

    Create a class called MorningOrNight in your Practice_Programming project and inside the day12_tasks package

        Task:
    		Given some time value (int) in 24 hours format.
    		Print if it's the morning or night.
        		0 -11 : Morning
        		12-24 : Night

        		-> You can assume the value given is always valid (in the 24 hours range), but if you want a challenge use an if to control invalid values

            		-> Try to use variables instead of printing multiple times

			Hint: You can use ternary if you can. If not, you if else or what you think is easier for you.


        	Ex:
        		Enter a time ( between 1 and 24 in whole numbers) to find if it is a day or night time:
            		9

            		OUTPUT:
				Morning
 */

import java.util.Scanner;

public class MorningOrNight {

    public static void main(String[] args) {
        Scanner time = new Scanner(System.in);
        int num = time.nextInt();

        if (num >= 0 && num <= 11) {
            System.out.println("Morning");

        } else if (num >= 12 && num <= 24) {
                System.out.println("Night");


            }
        }
    }

