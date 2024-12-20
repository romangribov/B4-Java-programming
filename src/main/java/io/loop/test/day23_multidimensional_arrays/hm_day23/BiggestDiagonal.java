package io.loop.test.day23_multidimensional_arrays.hm_day23;
/*
Task 1 - BiggestDiagonal

    Create a class called BiggestDiagonal in your Practice_Programming project and inside the day23_tasks package

        Task:
		Given a 2D array with values:

			{3, 5, 1}
			{1, 6, 10}
			{5, 21, 10}


		Calculate and find the biggest diagonal

			(3+6+10) = 19
			(1+6+6) = 13

			Output 3, 6, 10
 */

public class BiggestDiagonal {
    public static void main(String[] args) {
//        String [][] groups1 = new String[4][]; // this 2D array will hold 4 single dimensional array
//        // {{}, {}, {}, {}}
//        String [][] groups2 = new String[4][3]; //
//
//        int [][] all2 = {  {5, 10, 20, 10},  {5, 10, 100, 39, 19}  };
//        int [][] all = {groups1, groups2}

        int [][] arr2D = {
                {3, 5, 1},          // SINGLE dimensional array which has 3 elements -- index 0
                {1, 6, 10},         // SINGLE dimensional array which has 4 elements -- index 1
                {5, 21, 10},        // SINGLE dimensional array which has 3 elements -- index 2

        };
        System.out.println(arr2D.length);
        System.out.println(arr2D[0].length);
        System.out.println(arr2D[1].length);
        System.out.println(arr2D[2].length);

        }
    }

