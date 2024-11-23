package io.loop.test.day14_string.hm_day14;

/*
Task #2 - Filter

    Create a class called Filter in your Practice_Programming project and inside the day12_tasks package

        Task:

    		Ask the user to enter a message
    		Clean the message for empty spaces in the beginning and end
    		Check the message for bad phrases:

			Ex Bad phrases are:
        			java is bad
        			quit
        			have fun
        			crying


		if there is a bad phrase in the message print:

        		message failed to send

    		otherwise print:

			$message sent


 */


import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your message:");
        String message = scanner.nextLine();


        message = message.trim();


        if (message.contains("java is bad") ||
                message.contains("quit") ||
                message.contains("have fun") ||
                message.contains("crying")) {
            System.out.println("message failed to send");
        } else {
            System.out.println("message sent");
        }


    }
}
