package io.loop.test.day24_methods.hm_day24;
/*
Task #6 - MethodPractice6


        Task:

		create a method that will accept a String
		and find if it is Palindrome or not
 */

import java.util.Scanner;

public class MethodPractice6 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please write enter a word to see if its a palindrome: ");
        String palindrome = key.nextLine();
        polindromeTester(palindrome);


    }

    public static void polindromeTester (String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);


        }
        System.out.println(reversed);
        if (word.equalsIgnoreCase(reversed)){
            System.out.println("is Palindrome");
        }else{
            System.out.println("it is not palindrome");
        }

    }





}
