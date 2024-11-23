package io.loop.test.day09_a_scanner.Hm_day9;

import java.util.Scanner;

public class PrintGreatest {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("First number");
        int num1 = key.nextInt();
        System.out.println("Sceond number");
        int num2 = key.nextInt();
        System.out.println("Third number");
        int num3 = key.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.println("The greatest number from" + num1 +", " + num2 + ", " + num3 + " is: " + num1);

        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number from" + num1 + ", " + num2 + ", " + num3 + "is: " + num2);

        } else if (num3 > num2 && num3 > num1) {
            System.out.println("The greatest number from " + num1 + ", " + num2 + ", " + num3 + " is: " + num3);
        }
    }
}
