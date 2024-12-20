package io.loop.test.day23_multidimensional_arrays.hm_day23;

public class AverageOfEach {
    public static void main(String[] args) {

        double [][] num = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        double totalSum = 0;
        int totalLength = 0;


        for (double[] each : num) {
            double sumEachArr = 0;


            for (double eachElem : each) {
                sumEachArr += eachElem;
            }


            System.out.println("Average is: " + sumEachArr / each.length);


            totalSum += sumEachArr;
            totalLength += each.length;
        }


        System.out.println("Average of the entire 2D array: " + totalSum / totalLength);
    }
}
