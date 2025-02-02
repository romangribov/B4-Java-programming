package day19_tasks;

import java.util.Scanner;

public class BookValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the text of your book:");
        String bookText = scanner.nextLine();


        bookText = bookText.toLowerCase();


        int chapterCount = 0;
        int index = 0;


        while ((index = bookText.indexOf("chapter", index)) != -1) {
            chapterCount++;
            index += "chapter".length();
        }


        int bookValue = chapterCount * 10;


        System.out.println("The value of the book: $" + bookValue);
    }
}
