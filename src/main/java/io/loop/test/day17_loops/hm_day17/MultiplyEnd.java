package day18_tasks;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();


        char lastChar = inputString.charAt(inputString.length() - 1);


        String result = inputString;


        for (int i = 0; i < n; i++) {
            result += lastChar;
        }


        System.out.println("Output: " + result);
    }
}
