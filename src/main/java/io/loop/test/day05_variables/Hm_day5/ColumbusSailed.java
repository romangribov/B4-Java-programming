package io.loop.test.day05_variables.Hm_day5;

/*
Task #3 - ColumbusSailed

    Create a class called ColumbusSailed in your Practice_Programming project and inside the day04_tasks package

        Task:
                WRITE A JAVA PROGRAM CODE FOR:
                    ASSIGN THE VALUE "IN 1491 COLUMBUS SAILED THE OCEANBLUE" TO AN APPROPRIATE VARIABLE,
                WRITE A PROGRAM IN JAVA TO CHANGE THE YEAR IN THE STATEMENT ABOVE FROM 1491 TO 1492.
 */

public class ColumbusSailed {

    public static void main(String[] args) {

//    int oceanBlue = 1491;
//    int year = 1;

    int year = 1491;
        year =  year + 1;
    String total = "IN " + year + " COLUMBUS SAILED THE OCEANBLUE";

//        System.out.println(" IN 1491 COLUMBUS SAILED THE OCEANBLUE");
        System.out.println(total);


    }
}
