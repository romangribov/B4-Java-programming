package io.loop.test.day28_arraylist.hm_day28;
/*
Task #3 - HidePassword

    Create a class called HidePassword in your Practice_Programming project and inside the day28_tasks package

        Task:
		Given an ArrayList of passwords (String).
		Hide each password in a star (*) format where each character is a star and print the ArrayList of hidden passwords

		Ex:
			Input:
				{"one", "hi", "hold}
			Output:
				[ ***, **, **** ]
 */

import java.util.ArrayList;

public class HidePassword {
    public static void main(String[] args) {

        ArrayList <String> passwords = new ArrayList<>();
        passwords.add("one");
        passwords.add("hi");
        passwords.add("hold");

        System.out.println("Original: " + passwords);
        ArrayList <String> hiddenPasswords = new ArrayList<>();

        for ( String eachPassword : passwords ) {
            String hiddenPass = "";


            for (int i = 0; i < eachPassword.length(); i++) {
                hiddenPass += "*";
            }

            hiddenPasswords.add(hiddenPass);
        }

        System.out.println("Hidden: " + hiddenPasswords);
    }
}
