package io.loop.test.day12_switch_statements.hm_day12;
/*
Task #7 - Operators

    Do it without IntelliJ first.

    Once you have completed then you can create a class called Operators in your Practice_Programming project and inside the day12_tasks package

        Task a:
        	Analyze each step, What is the result of a, b, and c?

        		int a = 3,  b = 2;
        		long c = (a--+ b) * 2 / 3 % 2;

        Task b:
        	Analyze each step, What is the result numOne, numTwo, and biggest?

        		int numOne = 10;
        		int numTwo = numOne++ * 3 + ++numOne + numOne++ % 2;
        		int biggest = numOne > numTwo ? numOne : numTwo;

 */
public class Operators {

    public static void main(String[] args) {


        //TASK A

        int a  = 3;
        int b  = 2;
        long c = (a-- + b) * 2 / 3 % 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println("--------------------");

        // TASK B

        int num1    = 10;
        int num2    = num1++ * 3 + ++num1 + num1++ % 2;
        int biggest = num1 > num2 ? num1 : num2;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(biggest);

    }

}