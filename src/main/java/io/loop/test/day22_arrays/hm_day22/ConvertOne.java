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

       char[] charArray = num.toCharArray();

 //       System.out.println(num);

        System.out.println("Convert: " + Arrays.toString(charArray));

//        char [] charArray = new char [num.length()];

 //       char [] num1 = {'a', 'b', 'c'};
  //      String






    }
}
