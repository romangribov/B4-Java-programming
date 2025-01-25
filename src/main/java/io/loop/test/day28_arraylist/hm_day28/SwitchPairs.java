package io.loop.test.day28_arraylist.hm_day28;

import java.util.ArrayList;
import java.util.Arrays;

/*
    Create a class called SwitchPairs in your Practice_Programming project and inside the day28_tasks package

        Task:

		Given an ArrayList of words switch position for each pair in the List.
		A pair is an element and the element next to it.
		The given ArrayList will always have an even number of elements so each element will always have a single pair.

		Ex:

			Input:
				{"Cat", "in", "the", "hat"}

				There is two pairs:

					"Cat" and "in"
					"the" and "hat"

			Output:
				{"in", "Cat", "hat", "the”}
 */


public class SwitchPairs {
    public static void main(String[] args) {

        ArrayList<String> strList = new ArrayList<>();
        strList.add("Cat");
        strList.add("in");
        strList.add("the");
        strList.add("hat");


        System.out.println(switchWordsPositions(strList));
    }

    public static ArrayList<String> switchWordsPositions(ArrayList<String> strList) {


        for (int i = 0; i < strList.size() - 1; i += 2) {

            String word = strList.get(i);

            strList.set(i, strList.get(i + 1));
            strList.set(i + 1, word);
        }

        return strList;
    }
}
