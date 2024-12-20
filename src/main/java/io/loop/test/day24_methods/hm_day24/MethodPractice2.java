package io.loop.test.day24_methods.hm_day24;
/*
Task #2 - MethodPractice2

        Task:
		create a method that will accept an age and determine if the person is eligible to vote.
		18 years or older Person must be eligible to vote

 */

public class MethodPractice2 {

    public static void main(String[] args) {
        int age = 25;
        isEligible(age);

    }
        public static void isEligible (int age){

            if (age >= 18) {
                System.out.println("isEligible to vote");

            }else{
                System.out.println("Not isEligible");
            }
        }
    }

