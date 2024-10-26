package io.loop.test.day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main (String [] args) {
        // This is explaining the spaces
        System.out.println("A Sentence");
        System.out.println(" A Sentence");
        System.out.println("  A Sentence"); // has 2 spaces at the begining
        System.out.println("   A Sentence"); // has 3 spaces at the beginning
        System.out.println("    A Sentences"); // has 4 spaces at the begining

        // Now, I will  use tab to do 4 spaces t one: \t --- > 4 spaces

        System.out.println("\tA Sentence");

        // Lets ut 2 tabs
        System.out.println("        A Sentence");
        System.out.println("\t\tA Sentence");

        System.out.println();

        // This is explaining New Line
        System.out.println("1) Unlock Open door");
        System.out.println("2) Get into the car");
        System.out.println("3) Start the car");

        System.out.println();
        System.out.println("1) Unlock Open door\n2) Get into the car\n3 Start the car");

        System.out.println();

        System.out.println("Week Days:\n    Monday\n    Thursday\n\tWednesday\n\tFriday\n\tSaturday\n\tSunday");
        /*
        Week Days:
            Monday
            Tuesday
            .
            .
            .
            Sunday

         */

    }
}
