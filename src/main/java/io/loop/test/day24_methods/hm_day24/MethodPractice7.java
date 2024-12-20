package io.loop.test.day24_methods.hm_day24;
/*
 Task:

		Create a method that accept an int array.
		Take the sum of all the numbers and print the result
 */

public class MethodPractice7 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        sumOfArr(nums);

    }

    public static void sumOfArr(int [] nums){
        int total = 0;

        for (int eachNum : nums ){
            total += eachNum;

        }
        System.out.println(total);

        }
    }
