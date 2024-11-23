package io.loop.test.day15_string.hm_day15;
/*
Task #3 - BadWord

    Create a class called BadWord in your Practice_Programming project and inside the day15_tasks package

        Task:
    		Given a String variable with a message.
    		You will check if the message contains any of these bad words: “idiot, dumb, heck”

        		If the message contains any of those words print: “Message not sent”.
        		If the message is bad word free print “Message sent”
 */

import java.util.Scanner;

public class BadWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your message: ");
        String message = scanner.nextLine();


        if (message.toLowerCase().contains("idiot") ||
                message.toLowerCase().contains("dumb") ||
                message.toLowerCase().contains("heck")) {
            System.out.println("Message not sent");
        } else {
            System.out.println("Message sent");
        }
    }
}
