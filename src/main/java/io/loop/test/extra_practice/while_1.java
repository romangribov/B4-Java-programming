package io.loop.test.extra_practice;

import java.util.Scanner;

public class while_1 {
    public static void main(String[] args) {
        System.out.println("Ведите число менее 50");
        int a = new Scanner(System.in).nextInt();

        while (a <= 50) {
            if (a % 2 == 0) {
                System.out.println(a);

            }
            a++;
        }
    }
}
