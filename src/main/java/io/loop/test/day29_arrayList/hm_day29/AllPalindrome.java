package io.loop.test.day29_arrayList.hm_day29;
/*
    Create a class called AllPalindrome in your Practice_Programming project and inside the day29_tasks package

        Task:

		Create a method that will accept an ArrayList of Strings and return an ArrayList of Palindrome Strings Ignore case sensitivity

		Ex:

			Input:
				Anna", "Java", "Python", "Racecar", "Level", "Loopcamp”, "Eye"


			Output:
				Anna, Racecar, Level, Eye
 */

import java.util.ArrayList;


public class AllPalindrome {


    public static boolean isPalindrome(String str) {

        str = str.toLowerCase();

        int start = 0;
        int end = str.length() - 1;


        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static ArrayList<String> findPalindromes(ArrayList<String> inputList) {
        ArrayList<String> palindromeList = new ArrayList<>();


        for (String str : inputList) {

            if (isPalindrome(str)) {
                palindromeList.add(str);
            }
        }

        return palindromeList;
    }

    public static void main(String[] args) {

        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("Anna");
        inputList.add("Java");
        inputList.add("Python");
        inputList.add("Racecar");
        inputList.add("Level");
        inputList.add("Loopcamp");
        inputList.add("Eye");


        ArrayList<String> result = findPalindromes(inputList);


        System.out.println(result);
    }
}
