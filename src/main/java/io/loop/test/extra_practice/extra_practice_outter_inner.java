package io.loop.test.extra_practice;

public class extra_practice_outter_inner {
    public static void main(String[] args) {

    for (int i = 3; i > 0; i--) {  //1
        for (int j = 1; j <= i; j++) { //3
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
}
