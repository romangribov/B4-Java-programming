package io.loop.test.day09_a_scanner.Hm_day9;

import java.util.Scanner;

public class IfStatementsOperators {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Write a boolean value (true | false): ");
        boolean value = key.nextBoolean();
        if (value==true){
            System.out.println("The opposite of you what you put is: " + !value);
        } else {
            System.out.println("The opposite of you what you put is: " + !value);
        }
    }
}