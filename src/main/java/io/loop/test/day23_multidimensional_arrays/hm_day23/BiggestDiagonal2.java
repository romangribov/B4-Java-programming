package io.loop.test.day23_multidimensional_arrays.hm_day23;

public class BiggestDiagonal2 {
    public static void main(String[] args) {

        int[][] numbers = {
                {3, 5, 1},
                {1, 6, 10},
                {5, 21, 10},
        };


        int[] numbers1 = {numbers[0][0], numbers[1][1], numbers[2][2]};
        int[] numbers2 = {numbers[0][2], numbers[1][1], numbers[2][0]};


        int diagonal1 = numbers[0][0] + numbers[1][1] + numbers[2][2];
        int diagonal2 = numbers[0][2] + numbers[1][1] + numbers[2][0];


        if (diagonal1 > diagonal2) {
            System.out.println("The biggest diagonal is: ");
            for (int eachNum1 : numbers1) {
                System.out.print(eachNum1 + " ");
            }
        } else {
            System.out.println("The biggest diagonal is: ");
            for (int eachNum2 : numbers2) {
                System.out.print(eachNum2 + " ");
            }
        }
    }
}
