package io.loop.test.day23_multidimensional_arrays.hm_day23;

/*
Task #4 - LastChars

    Create a class called LastChars in your Practice_Programming project and inside the day23_tasks package

        Task:
		Given a 2D String array, concatenate the last character of each inner element on one line, then each following array values in separate lines

		Ex:

			{"James", "is", "back"}
			{"he", "was", "never", "gone"}
			{"methods", "tomorrow"}

		Output:
			ssk
			esre
			sw
 */

import java.util.Arrays;

public class LastChars {

    public static void main(String[] args) {

        String [][] arr = {
                {"James", "is", "back"},
                {"he", "was", "never", "gone"},
                {"methods", "tomorrow"}

        };

        System.out.println(Arrays.deepToString(arr));
        for (String[] eachSingleArr : arr) {
        String lastChar = "";

        for (String eachElem : eachSingleArr) {
            lastChar += eachElem.charAt(eachElem.length() -1);

        }
        System.out.println(lastChar);

        }

    }
}
