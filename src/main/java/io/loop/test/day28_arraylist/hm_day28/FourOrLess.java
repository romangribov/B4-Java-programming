package io.loop.test.day28_arraylist.hm_day28;
/*
Task:
        	Given an ArrayList of Strings, go through and find Strings that are 4 characters or less.
		Take those Strings and put them into a different ArrayList. Print that ArrayList of words



		Ex:
			Input:
				“apples”, “tree”, “loop, “cat”, “animal”, “shortcut”

			Output:
				[ tree, loop, cat ]

 */

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        String[] items = {"apples", "tree", "loop", "cat", "dog", "animal", "shortcut", "java", "house"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(items));
        System.out.println(fourOrLess(arrayList));

    }

    public static ArrayList<String> fourOrLess(ArrayList<String> arrayList) {
        ArrayList<String> lessThan = new ArrayList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            String word = arrayList.get(i);
            if (word.length() <= 4) {
                lessThan.add(word);
            }

        }
        return lessThan;

    }
}