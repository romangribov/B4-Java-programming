package day17_tasks;

import java.util.Scanner;

public class HTMLGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the HTML tag with the repetition count (e.g. div^2): ");
        String input = scanner.nextLine();


        int separatorIndex = input.indexOf('^');


        String tag = input.substring(0, separatorIndex);


        String numberStr = input.substring(separatorIndex + 1);


        int count = 0;
        for (int i = 0; i < numberStr.length(); i++) {

            char digit = numberStr.charAt(i);

            count = count * 10 + (digit - '0');
        }


        for (int i = 0; i < count; i++) {
            System.out.print("<" + tag + "></" + tag + ">");
        }
    }
}
