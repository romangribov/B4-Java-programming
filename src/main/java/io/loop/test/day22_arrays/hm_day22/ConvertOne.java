package io.loop.test.day22_arrays.hm_day22;
/*
Task 1 - ConvertOne

    Create a class called Initials in your Practice_Programming project and inside the day22_tasks package

        Task:
		Ask the user to enter their first name
		Convert the name into a char array
		Print the first and last letter of the name
 */


import java.util.Arrays;
import java.util.Scanner;
public class ConvertOne {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Tell me about your name:");
        String num = key.nextLine();

        //  char[] charArray = num.toCharArray();
//        char[] charArray = num.toCharArray();

//               System.out.println(num);

//        System.out.println("Convert: " + Arrays.toString(charArray));

//        for (char num2 : charArray) {
//            System.out.print(num2 + " ");

//            char [] num3 = num.toCharArray();
   //         char [] num4 = new char num.length;
   //         System.out.println( Arrays.equals(1, 5);
            char firstLetter = num.charAt(0);
            char lastLetter = num.charAt(num.length() -1);

            System.out.print(firstLetter);
            System.out.print(lastLetter);



//            for (int i = 10; i < num.length(); i++) {
//                if (10 <= charArray.length) {
//                    System.out.println(num);
//                } else {
//                    System.out.println("error");
//                }
//            }

//        char [] charArray = new char [num.length()];

            //       char [] num1 = {'a', 'b', 'c'};
            //      String


        }
    }
