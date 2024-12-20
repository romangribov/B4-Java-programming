package io.loop.test.day16_loops.hm_day16;
/*
Task #6 - SecretNumber

    Create a class called SecretNumber in your Practice_Programming project and inside the day16_tasks package



	create a program to guess the secret number.
	flow will be as follows:
	define the secret number, hard coded
	ask the user to guess a number
	based on the guess tell them a message:

  	if they guess higher than the number:
      		too high

  	if they guess lower than the number:
      		too low

  	if they guess the number:
      		you guessed correctly

     	 -> this will stop the guessing flow


	Challenge: keep track of the number of attempts taken to guess right
 */

import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int secretNumber = 42;  //
        int guess;
        int attempts = 0;  //

        do {
            System.out.print("Guess the secret number: ");
            guess = scanner.nextInt();
            attempts++;


            if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("You guessed correctly!");
                System.out.println("It took you " + attempts + " attempts.");
            }

        } while (guess != secretNumber);
    }
}
