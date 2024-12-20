package day19_tasks;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        input = input.toUpperCase();


        String result = "";


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            int count = 0;


            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == currentChar) {
                    count++;
                }
            }


            if (count == 1) {
                result += currentChar;
            }
        }


        System.out.println("Unique characters: " + result);
    }
}
