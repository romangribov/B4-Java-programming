package io.loop.test.day05_variables.Hm_day5;

/*
Task #2 - CarDriverInfo

    Create a class called CarDriverInfo in your Practice_Programming project and inside the day04_tasks package

        Task:
            add new class CarDriverInfo
            add main method

            carModel    -> String
            driverName  -> String
            licenseNum  -> String
            speed       -> short    // mph
            isAutomatic -> boolean
            licenseClass-> char


            -you can give any value that you want
            -Print out each of them with some explanation

            Ex:
                My car is: BMW
                Driver name: James
 */

public class CarDriverInfo {

    public static void main(String[] args) {

        String carModel = "BMW";
        String driverName = "James";
        String licenseNum = "3341578";
        short speed = 55;
        boolean isAutomatic = true;
        char licenseClass = 'B';

        System.out.println("My car is " +carModel+" Driver name "+driverName+ " Number of license " +licenseNum+ " he is driving at the speed of "+speed+" mph"+ " cartransmission " +isAutomatic+" license of the car class "+ licenseClass+"");


    }
}
