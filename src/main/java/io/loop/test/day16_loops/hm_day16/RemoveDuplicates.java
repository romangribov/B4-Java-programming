package io.loop.test.day16_loops.hm_day16;
/*
Task #4 - RemoveDuplicates

    Create a class called RemoveDuplicates in your Practice_Programming project and inside the day16_tasks package

        Task:
                    challenge: if you want to push yourself, otherwise don't worry about this one, we will talk about Strings and loop after some more time

                    write a program that can remove duplicates from a string
                        ex:
                            "abcabc"
                        output:
                            abc
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "abcabc";
        String result = "";


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            if (result.indexOf(currentChar) == -1) {
                result += currentChar;
            }
        }


        System.out.println(result);
    }
}
