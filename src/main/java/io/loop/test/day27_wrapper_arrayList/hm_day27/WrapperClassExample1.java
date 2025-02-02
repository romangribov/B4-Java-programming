package io.loop.test.day27_wrapper_arrayList.hm_day27;

/*
Tasks 1 - WrapperClassExample1

    Create a class called WrapperClassExample1 in your Practice_Programming project and inside the day27_tasks_wrapper package


        Task:
    		CWrite program that returns true if the total number of uppercase
		characters are equal to total number of lowercase characters of a string

		Ex:
			str = "JAVA java";

		output:

			true
 */

public class WrapperClassExample1 {
    public static void main(String[] args) {
        String str="JAVA java";
        System.out.println(lowerAndUpperCase(str));
    }

    public static boolean lowerAndUpperCase(String str) {
        int upperCase = 0;
        int lowerCase = 0;
        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upperCase++;
            } else if (Character.isLowerCase(each)) {
                lowerCase++;
            }
        }
        return upperCase == lowerCase;
    }

}