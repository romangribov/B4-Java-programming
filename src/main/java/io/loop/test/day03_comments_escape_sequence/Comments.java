package io.loop.test.day03_comments_escape_sequence;

import org.w3c.dom.ls.LSOutput;

public class Comments {

    public static void main(String[] args) {

        // 1 - SINGLE Line COMMENT
        // The line below prints a words "Loopcamp" and goes to next line
        System.out.println("Loopcamp");

        /*
         2 - MULTILINE COMMENT

         The following code is a PRINTLN statement
         IT prints out "Java"
         then goes to the next line
         */
        System.out.println("Java");

        //          Commant + /
        //          ctrl + /

//        System.out.println("Comment out");
//        System.out.println("Test");
//        System.out.println("Check");
//        System.out.println("Code");

        System.out.println("Valid code");

        // 3 - JAVA CODE COMMENT
        /**
          3 - JAVA DOC COMMENT
         The following is Print statement
         It prints out "1st week of java
         */

        System.out.println("1st week of Java");


        // TODO: I need to find how much I spent for the computer
        System.out.println("I recently bought a computer for $.......");

        /*
        TODO: Check how much you need to deposit
         */
        System.out.println("Deposit $... to my account");

        // toDo: this just to remind that the syntax is not case sensative

        /**
         * TodO: can be used with Java DOC comment as well
         */
    }
}
