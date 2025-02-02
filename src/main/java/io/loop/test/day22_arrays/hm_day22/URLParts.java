package io.loop.test.day22_arrays.hm_day22;
/*
Task #5 - URLParts

    Create a class called URLParts in your Practice_Programming project and inside the day22_tasks package

        Task:

                Given a url as follows, print each section of the url separated by the forward slash /


		Example:

			url = https://learn.loopcamp.com/courses/130

		output:
			https:

			learn.loopcamp.com
			courses
			130
 */

import java.util.Arrays;

public class URLParts {
    public static void main(String[] args) {


        String url = "url = https://learn.loopcamp.com/courses/130";

        String[] strArr = url.split("/");

        System.out.println("Before reverse: " + Arrays.toString(strArr));

        System.out.println("------------------");

        String reversed = "";
        for (int i = strArr.length - 1; i >= 0; i--) {
            reversed += strArr[i] + "/";
        }
        System.out.println(reversed);
        String [] reversedArr = reversed.split("/");
        System.out.println("After reverse: " + Arrays.toString(reversedArr));
        }
    }
