package io.loop.test.day28_arraylist.hm_day28;

import java.util.ArrayList;

public class GetUpperCaseOrLowerCase {
    public static void main(String[] args) {
        String str = "heLLoWoRlD";
        getUpperOrLowercase(str);
    }

    public static void getUpperOrLowercase(String str) {
        ArrayList<Character> lowerCase = new ArrayList<>();
        ArrayList<Character> upperCase = new ArrayList<>();

        for (Character each : str.toCharArray()) {
            if (Character.isLowerCase(each)) {
                lowerCase.add(each);
            } else {
                upperCase.add(each);
            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
    }
}