package io.loop.test.day11_if_statements.hm_day11;

import java.util.Scanner;

public class PandemicChecker {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int year = key.nextInt();
        if (1346 <= year && 1353 <= year) {
            System.out.println("The Black Death" );
        } else if (1665 <= year && year <= 1666) {
            System.out.println("Great Plague of London" );
        } else if (1770 <= year && year <= 1772) {
            System.out.println("Russian plague" );
        } else if (1889 <= year && year <= 1890) {
            System.out.println("Flu pandemic");
        } else if (1916 == year) {
            System.out.println("American polio epidemic" );
        } else if (1918 <= year && 1920 <= year) {
            System.out.println("Spanish Flu");
        } else if (2009 <= year && 2010 <= year) {
            System.out.println("H1N1 Swine Flu Pandemic");
        } else if (2014 <= year && 2016 <= year) {
            System.out.println("West African Ebola epidemic");
        } else if (2020 <= year && 2022 <= year) {
            System.out.println("COVID-19");
        }else System.out.println("No Pandemic");

    }
}
