package io.loop.test.day23_multidimensional_arrays.hm_day23;

public class NumRange {
    public static void main(String[] args) {
        
        int [][] arr = new int [10] [10];
        int number = 1;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = number;
                number++;
            }
            
        }

        for (int[] each : arr) {
            for (int i = 0; i < each.length; i++) {
                System.out.println(each[i]);
                if (i != each.length - 1) {
                    System.out.println(", ");
                }
                
            }
            System.out.println();
        }
    }
}
