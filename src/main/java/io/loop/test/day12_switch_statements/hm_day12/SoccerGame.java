package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #11- SoccerGame

    Create a class called SoccerGame in your Practice_Programming project and inside the day12_tasks package

        Task:

             	    declare and assign a minutes variable
                        use the minutes value to determine how much time is left in the soccer game

                        use these ranges to determine the outputs:

                        - any number less than 0 and more than 90 are not valid:

                            when the minutes is less than 0:
                                print: minutes cannot be a negative number
                            when the minutes is more than 90:
                                print: games cannot be longer than 90 minutes

                        - when the minutes are between 90 - 75
                            print: just getting started

                        - when the minutes are between 74 - 60
                            print: players are doing their best

                        - when the minutes are between 59 - 30
                            print: middle of the game is going great

                        - when the minutes are between 29 - 0
                            print: the end of the same is approaching

 */

import java.util.Scanner;

public class SoccerGame {
        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);

            int minutes;

            System.out.println("Pick a number to see how the game time is going: ");
            int  minutesLeftInGame = keyboard.nextInt();

            if (minutesLeftInGame < 0) {
                System.out.println("Minutes cannot be a negative number");
            }
            else if (minutesLeftInGame >= 75 && minutesLeftInGame <= 90) {
                System.out.println("Game just getting started");
            }
            else if (minutesLeftInGame >= 74 && minutesLeftInGame <= 60) {
                System.out.println("Players are doing their best");
            }
            else if (minutesLeftInGame >= 59 && minutesLeftInGame <= 30) {
                System.out.println("Middle of the game is going great");
            }
            else if (minutesLeftInGame >= 29 && minutesLeftInGame <= 0) {
                System.out.println("The end of the same is approaching");
            }
            else
                System.out.println("Games cannot be longer than 90 minutes");

        }

    }

