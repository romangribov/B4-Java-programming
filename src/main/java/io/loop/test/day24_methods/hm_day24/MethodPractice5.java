package io.loop.test.day24_methods.hm_day24;
/*
        Task:

		create a method that accepts a String
		and print each character of the String on a seperate line
 */

import java.util.Scanner;

public class MethodPractice5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you sentence");
        String str = scan.nextLine();
        groesdGros(str);
    }

        public static void groesdGros(String str){

            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));

            }
    }

        public static void withEachLoop(String str) {
            for (char ch: str.toCharArray()){
                //Print each character on a separate line
                System.out.println(ch);
            }

    }
}
