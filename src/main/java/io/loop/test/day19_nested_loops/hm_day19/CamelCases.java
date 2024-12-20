package day19_tasks;

import java.util.Scanner;

public class CamelCases {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a camel case string:");
        String camelCaseString = scanner.nextLine();


        int wordCount = 1;


        for (int i = 1; i < camelCaseString.length(); i++) {

            if (Character.isUpperCase(camelCaseString.charAt(i))) {
                wordCount++;
            }
        }


        System.out.println("Number of words in the camel case string: " + wordCount);
    }
}
