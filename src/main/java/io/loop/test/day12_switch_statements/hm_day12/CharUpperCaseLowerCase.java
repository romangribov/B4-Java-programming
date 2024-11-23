package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #2 - CharUpperCaseLowerCase

    Create a class called CharUpperCaseLowerCase in your Practice_Programming project and inside the day12_tasks package

        Task:
    		Given a letter (char) determine if the character is an uppercase letter or lowercase letter

        	Note: 	'b'  --> lowercase
            		'G' --> uppercase
            		'O'  --> uppercase

            		Hint: 	Use the ASCII table.
			      	Also, note that there is a different of 32 between upper case and lower case

				There is a 32 difference between upper and lower cases. lowercase = uppercase + 32;
        			Also, the range for uppercase is from 65 (inclusive) to 90 (inclusive), for lowercase it is from 97 (inclusive) to 122 (inclusive)


        	Ex:
        		Enter letter to be converted:
            		A

            		OUTPUT:
                		a
 */

public class CharUpperCaseLowerCase {

    public static void main(String[] args) {

        char upperCaseChar = 'b'; // Заглавная буква
        char lowerCaseChar = (char) (upperCaseChar - 32);
        System.out.println(lowerCaseChar);

        upperCaseChar = 'G'; // Заглавная буква
        lowerCaseChar = (char) (upperCaseChar + 32);
        System.out.println(lowerCaseChar);

        upperCaseChar = 'O'; // Заглавная буква
        lowerCaseChar = (char) (upperCaseChar + 32);
        System.out.println(lowerCaseChar);


    }
}
