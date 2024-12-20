package day19_tasks;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number:");
        int n = scanner.nextInt();

        System.out.print("Prime numbers from 2 to " + n + ": ");


        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;


            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
