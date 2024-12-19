package io.loop.test.day27_wrapper_arrayList.hm_day27;
/*
Task #4 - ArrayListExample4

    Create a class called ArrayListExample4 in your Practice_Programming project and inside the day27_tasks_arraylist package

        Task:
		Create an ArrayList of Characters
		Fill the ArrayList with letters from a-z
		Print the ArrayList of all the characters

		Manually remove each vowels and print the new ArrayList
 */

import java.util.ArrayList;

public class ArrayListExample4 {

    public static void main(String[] args) {

        ArrayList <Character> name = new ArrayList<>();

        for (char i = 'a'; i < 'z'+1; i++) {
            name.add(i);
        }
        System.out.println("name=" + name);
        name.remove(1);
        System.out.println(name);
        name.remove(3);
        name.remove(6);

        }


    }

