package day05_variables;

public class MyName {
    public static void main(String[] args) {

        char letter1 = 'F';
        char letter2 = 'e';
        char letter3 = 'y';
        char letter4 = 'r';
        char letter5 = 'u';
        char letter6 = 'z';

        // CONCATENATION
        System.out.println(letter1);
        System.out.println("letter2 = " + letter2);
        System.out.println("letter3 = " + letter3);
        System.out.println("letter4 = " + letter4);
        System.out.println("letter5 = " + letter5);
        System.out.println("letter6 = " + letter6);

        System.out.println();

        // ADDITION
        System.out.println(0 + letter1);
        System.out.println(0 + letter2);
        System.out.println(0 + letter3);
        System.out.println(0 + letter4);
        System.out.println(0 + letter5);
        System.out.println(0 + letter6);

        System.out.println();

        // ADDITION
        System.out.println(letter1 + letter2 + letter3 + letter4 + letter5 + letter6);  // int

        String myName = "" + letter1 + letter2 + letter3 + letter4 + letter5 + letter6; // String
        System.out.println(myName);
    }
}