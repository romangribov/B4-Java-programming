package io.loop.test.day09_a_scanner.Hm_day9;
import java.util.Scanner;

public class OceanTank {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your current oxygen level of in your tank?: ");

        int oxygen = input.nextInt();

        if(oxygen>=90){
            System.out.println("Your tank is full");

        }
        else if (oxygen>=80){
            System.out.println("Still okay");

        }
        else if(oxygen>=70){
            System.out.println("Dont go too far");
        }
        else  if(oxygen>=60){
            System.out.println("Start to head back");
        }
        else if (oxygen>=50){
            System.out.println("Be careful now you are at 50%");
        }
    }
}