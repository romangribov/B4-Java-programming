package io.loop.test.day16_loops.hm_day16;
/*
Task #3 - PrintLettersCombination

    Create a class called PrintLettersCombination in your Practice_Programming project and inside the day16_tasks package

        Task:
                    Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'.
                    The combinations should be displayed in descending alphabetical order:

                    zz

                    zy

                    zx

                    zw

                    zv

                    yz

                    ....

                    vv

 */

public class PrintLettersCombination {

    public static void main(String[] args) {

        char[] letters = {'z', 'y', 'x', 'w', 'v'};

        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                System.out.println("" + letters[i] + letters[j]);
            }
        }
    }
}
