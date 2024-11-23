package io.loop.test.day15_string.hm_day15;
/*
Task #6 - RelativeChecker

    Create a class called RelativeChecker in your Practice_Programming project and inside the day15_tasks package

        Task:
                Given two full names check if the two people are related.
                They will be considered to be related if they have the same last name
                    Ex:
                        Input:
                            James Bond
                            Jamie Bond
                        Output:
                            Related

                        Input:James Bond
                              Alex Benji
                        Output:
                              Not Related
 */

import java.util.Scanner;

    public class RelativeChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the first full name: ");
            String fullName1 = scanner.nextLine();

            System.out.print("Enter the second full name: ");
            String fullName2 = scanner.nextLine();


            String lastName1 = fullName1.substring(fullName1.lastIndexOf(" ") + 1);
            String lastName2 = fullName2.substring(fullName2.lastIndexOf(" ") + 1);


            if (lastName1.equals(lastName2)) {
                System.out.println("Related");
            } else {
                System.out.println("Not Related");
            }
        }
    }


