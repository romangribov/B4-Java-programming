package io.loop.test.day28_arraylist.hm_day28;

import java.util.ArrayList;

public class SeparateParts {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();


        for (char eachChar : str.toCharArray()) {
            if (Character.isUpperCase(eachChar)) {

                list2.add(eachChar);
            } else if (Character.isDigit(eachChar)) {

                list3.add(eachChar);
            } else {

                list1.add(eachChar);
            }
        }


        System.out.println("List1 (special characters): " + list1);
        System.out.println("List2 (uppercase letters): " + list2);
        System.out.println("List3 (digits): " + list3);
    }
}
