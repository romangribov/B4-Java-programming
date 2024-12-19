package io.loop.test.day27_wrapper_arrayList.hm_day27;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = scan.nextLine();
        isValid(password);
    }

    public static boolean isValid(String str) {
        int upperCase = 0;
        int lowerCase = 0;
        int number = 0;
        int symbol = 0;
        if (str.length() >= 8) {
            for (char eachLetter : str.toCharArray()) {
                if (Character.isUpperCase(eachLetter)) {
                    upperCase++;
                } else if (Character.isLowerCase(eachLetter)) {
                    lowerCase++;
                } else if (Character.isDigit(eachLetter)) {
                    number++;

                } else {
                    symbol++;
                }
            }
            if (upperCase < 1 || lowerCase < 1 || number < 1 || symbol < 1) {
                System.out.println("Invalid password!");
            } else {
                System.out.println("Your password is accepted");
            }

        }
        System.out.println("Invalid password!");
        return true;

    }
}