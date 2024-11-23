package io.loop.test.day15_string.hm_day15;
/*
Task #8 - WordFile


	Create a class called WordFile in your Practice_Programming project and inside the day15_tasks package



        Task:
		Ask a user to give a full name
            	Then ask a user
                	Which od the following options you would like to do?
                    		1. Make all UPPER case
                    		2. Make all lower case
                    		3. Make each word capitalized

                    		You option: 1, 2, 3

                 	Then print out what user gave you as full name in the option they selected

 */

import java.util.Scanner;

public class WordFile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Шаг 1: Запрашиваем полное имя
            System.out.print("Please enter your full name: ");
            String fullName = scanner.nextLine();

            // Шаг 2: Запрашиваем, какой вариант преобразования выбрать
            System.out.println("Which of the following options would you like to do?");
            System.out.println("1. Make all UPPER case");
            System.out.println("2. Make all lower case");
            System.out.println("3. Make each word capitalized");
            System.out.print("Your option: ");
            int option = scanner.nextInt();

            String result = "";


            if (option == 1) {
                result = fullName.toUpperCase();
            } else if (option == 2) {
                result = fullName.toLowerCase();
            } else if (option == 3) {
                result = capitalizeWords(fullName);
            } else {

                System.out.println("Invalid option!");
                return;
            }

            System.out.println("Here is your name in the selected format: " + result);
        }

        public static String capitalizeWords(String input) {
            String[] words = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String word : words) {
                if (!word.isEmpty()) {

                }
                result.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }

            return result.toString().trim();
        }
    }

