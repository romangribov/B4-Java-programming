//package io.loop.test.day23_multidimensional_arrays.hm_day23;
///*
//Task #2 - MultiplyArray
//
//    Create a class called MultiplyArray in your Practice_Programming project and inside the day23_tasks package
//
//        Task:
//            Given two 2D arrays multiply them together and store the results into a new 2D array. Multiple each number in each position as its own calculation
//
//		Ex:
//
//			{1, 2, 3}
//			{2, 5, 10}
//			{0, 3, 20}
//
//				x
//
//			{10, 4, 3}
//			{5, 2, 7}
//			{100, 20, 5}
//
//		Output:
//
//			{10, 6, 9}
//			{10, 10, 70}
//			{0, 60, 100}
// */
import java.util.Arrays;

public class MultiplyArray {

    public static void main(String[] args) {

        int[][] name = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int[][] name2 = {
                {10, 4, 3},
                {5, 2, 7},
                {100, 20, 5}
        };


//        int result = new int [][] [name.length][0] [name2.length][1];
//
//        for (int i = 0; i <= name.length; i++) {
//            //if (name == name2[])
//            System.out.println("score result");
//            for (int j = 0; j < name2.length; j++) {
//             //  for (each == name*name2);
//
//            int result = name.length[0] * name2[1];
//            result = name[i] * name[j]

        int result [][] = new int[name.length][name2[0].length];

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name2[i].length; j++) {




        result [i][j] = name[i][j] * name2[i][j];

                for (int [] each : result) {
                    System.out.println(Arrays.toString(each));
                    
                };

            }

        }


            }


        }





