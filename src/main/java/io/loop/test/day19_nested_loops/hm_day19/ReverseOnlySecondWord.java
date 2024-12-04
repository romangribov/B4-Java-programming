package day19_tasks;

import java.util.Scanner;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a string with three words:");
        String input = scanner.nextLine();


        int firstSpaceIndex = input.indexOf(" ");
        int secondSpaceIndex = input.indexOf(" ", firstSpaceIndex + 1);


        if (firstSpaceIndex != -1 && secondSpaceIndex != -1) {

            String firstWord = input.substring(0, firstSpaceIndex);


            String secondWord = input.substring(firstSpaceIndex + 1, secondSpaceIndex);
            String reversedSecondWord = "";
            for (int i = secondWord.length() - 1; i >= 0; i--) {
                reversedSecondWord += secondWord.charAt(i);
            }


            String thirdWord = input.substring(secondSpaceIndex + 1);


            String result = firstWord + " " + reversedSecondWord + " " + thirdWord;


            System.out.println(result);
        } else {
            System.out.println("Invalid input. Please enter exactly three words.");
        }
    }
}
