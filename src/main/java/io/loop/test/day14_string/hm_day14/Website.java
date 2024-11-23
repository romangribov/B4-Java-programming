package io.loop.test.day14_string.hm_day14;

/*
Task #1 - Website

    Create a class called Website in your Practice_Programming project and inside the day14_tasks package

        Task:
    		add a main method


    		Ask the user to enter a website
    		check if it is a valid website

			- it is valid if it begins with:
				https://www.

			- it is valid if the end is:
				.io
				.org
				.gov
				.net

      			-in cases it is not valid, tell the reason why
 */

import java.util.Scanner;

public class Website {

    public static void main(String[] args) {

        Scanner site = new Scanner(System.in);
        System.out.println("Enter url");
        String url = site.nextLine().toLowerCase();

        boolean result = url.startsWith("https://www.");


        String str2 = "site";
    //    boolean res = url.endsWith(".io") || str2.endsWith(".org") || str2.endsWith(".net") || str2.endsWith(".gov");


        boolean urli = url.endsWith(".io.") || url.endsWith(".org") || url.endsWith(".gov") || url.endsWith(".net");

        if (result && urli) {
            System.out.println("It is valid website");
        } else {
            if (!result) {
                System.out.println("The website you entered should begin with \"https://www.\"");
            }
            if (!urli) {
                System.out.println("The website you entered should end with \n\t\t\t\t.io\n" + ".org" + ".gov" + ".net");


            }
        }
    }
}
