package io.loop.test.day07_relation_operators;

public class OperatorPractice2 {

    public static void main(String[] args) {
        int t = 100;

        int p = - ++t * t-- / t++ + --t;


        System.out.println(t);
        System.out.println(p);

        /*
        1) ++  --
        2) -(making it negative)
        3)  * / %
        4)  +   -

         */
    }
}
