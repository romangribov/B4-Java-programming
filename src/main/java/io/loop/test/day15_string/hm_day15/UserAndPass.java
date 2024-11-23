package io.loop.test.day15_string.hm_day15;
/*
Task #7 - UserAndPass

    Create a class called UserAndPass in your Practice_Programming project and inside the day15_tasks package

        Task:
                Given a username and password verify they are valid.
                    -The password cannot be less than 5 characters
                        If it is less print: "Password cannot be less than 5 characters"
                        If it is more than or equal to 5 print: "Valid password"
                    -Also,the password should not contain the username
                        -If the password has the username in it print:
                            "Invalid password, username should not be in it"
                                Also change the password to have the value: "password"
 */

import java.util.Scanner;

public class UserAndPass {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter username: ");
            String username = scanner.nextLine();

            System.out.print("Enter password: ");
            String password = scanner.nextLine();


            if (password.length() < 5) {
                System.out.println("Password cannot be less than 5 characters");
            } else {
                System.out.println("Valid password");

                if (password.contains(username)) {
                    System.out.println("Invalid password, username should not be in it");
                    password = "password";
                }
            }


            System.out.println("Final password: " + password);
        }
    }
