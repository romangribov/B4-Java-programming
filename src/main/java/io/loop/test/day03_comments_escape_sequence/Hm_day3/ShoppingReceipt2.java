package io.loop.test.day03_comments_escape_sequence.Hm_day3;



    /*
    Implementing the new knowledge on
the shopping receipt example.

ShoppingReceipt2

    Create a class called ShoppingReceipt in your Practice_Programming project and inside the day03_tasks package
    Create a main method
    Print the following:

****************************
    WELCOME TO THE STORE
****************************

-------------------------

Cake              $24
Water             $3.99
Apple Juice       $7.50
Bread             $4.25

-------------------------
TOTAL AMOUNT:     $39.74
TAX:              $3.90

GRAND TOTAL:      $43.64
-------------------------
*******THANK YOU*********
     */

public class ShoppingReceipt2 {

    public static void main(String[] args) {

        double Grand_Total = 43.64;
        double Total_Amount = 39.74;
        int Cake = 24;
        double Water = 3.99;
        double Apple_Juice = 7.50;
        double Bread = 4.25;
        double Tax = 3.90;



            System.out.println("**************************");
            System.out.println("\tWELCOME TO THE STORE\t");
            System.out.println("**************************");
            System.out.println("-------------------------");
            System.out.println("Cake \t\t\t\t" + "$"+Cake+"");
            System.out.println("Water \t\t\t\t" + "$"+Water+"");
            System.out.println("Apple Juice \t\t" + "$"+Apple_Juice+"");
            System.out.println("Bread \t\t\t\t" + "$"+Bread+"");
            System.out.println("");
            System.out.println("-------------------------");
            System.out.println("TOTAL AMOUNT:\t\t" + "$"+Total_Amount+"");
            System.out.println("TAX:\t\t\t\t" + "$"+Tax+"");
            System.out.println("");
            System.out.println("GRAND TOTAL:\t\t"+ "$"+Grand_Total+"");
            System.out.println("--------------------------");
            System.out.println("*******THANK YOU**********");



        }
    }
