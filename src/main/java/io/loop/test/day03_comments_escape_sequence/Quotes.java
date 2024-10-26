package io.loop.test.day03_comments_escape_sequence;





public class Quotes {

    public static void main(String[] args) {

        System.out.println("Everyone loves Java programming");

        /*
        Q: How if I want to print it with double quotes like below
        - Everyone love "Java" programming
         */

        System.out.println("Everyone loves \"Java\" programming");
        System.out.println("\"Everyone loves Java programming\"");

        /*
        Q: since we use \ slash as part of the syntax, then hiw /i pront backward slash itself
        -There programming languages like\python

        /*

         /*
        first backword slash is for the syntax
        second one is for the output text to be printed in the console
        */

        System.out.println("There programming languahes like java\\\\python");

        // Forward slash does bot require any ESCAPE SEQUENCE

        System.out.println("There programming languages like java\\\\python");
    }
}
