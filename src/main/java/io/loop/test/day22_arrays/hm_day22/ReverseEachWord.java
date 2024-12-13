package io.loop.test.day22_arrays.hm_day22;
/*
Task #4 - ReverseEachWord

    Create a class called ReverseEachWord in your Practice_Programming project and inside the day22_tasks package

        Task:
		Given a String, reverse each individual word and print the result

		Hint: Use a nested loop, split


		Input:
			It started to snow in Chicago
		Output:
			tI detrats ot wons ni ogacihC
 */

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {


        String str = "It started to snow in Chicago";

        String[] strArr = str.split(" ");

        System.out.println("Before reverse: " + Arrays.toString(strArr));

        System.out.println("------------------");

        String reversed = "";
        for (int i = strArr.length - 1; i >= 0; i--) {

            reversed += strArr[i] + " ";

        }
   //     reversed = reversed.trim();
        System.out.println(reversed);

        String [] reversedArr = reversed.split(" ");
        System.out.println("After reverse: " + Arrays.toString(reversedArr));
        }
    }
