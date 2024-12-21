package io.loop.test.day28_arraylist.hm_day28;
/*
Create a class called TargetWord in your Practice_Programming project and inside the day28_tasks package



        Task:
    		Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList

		Ex:
			Input:
				”java”, ”html”, “css”, “java”, “javascript”, “selenium
				Target: java

			Output:
				2
 */
import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        String[] words = {"java", "html", "css", "java", "javascript", "selenium"};
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(words));

        String targetWord = "java";
        countTarget(arrList,targetWord);

    }
    public static void countTarget(ArrayList<String> arrList, String targetWord){
        int count = 0;
        // Iterate through the ArrayList and count occurrences of the target word
        for (String each : arrList) {
            if (each.equals(targetWord)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
