package io.loop.test.day27_wrapper_arrayList.hm_day27;

import java.util.Scanner;

public class HTMLGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a name of tag and a number: ");
        String tag= scan.nextLine();
        int number= scan.nextInt();
        xtmlGenerator(tag,number);
    }
    public static void xtmlGenerator(String tag, int number){
        for (int i = 0; i < number; i++) {
            System.out.println("<" + tag + ">" + "</"+tag+">" );

        }
    }
}