package io.loop.test.day24_methods;

import java.time.Year;
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        System.out.println("Please, enter the year you were born: ");
        int userBirthYear = key.nextInt();

        calculateAge(userBirthYear);

    }


    public static void calculateAge(int year) {

        // userBirthYear = 1990;

        System.out.println("Your age: " + (2204 - year ) );
        System.out.println("Your age: " + (Year.now().getValue() - year) );

    }
}
