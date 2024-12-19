package io.loop.test.day24_methods.hm_day24;

public class MethodPractice1 {

    public static void main(String[] args) {
        int[] arr = new int[100];
        numArr(arr);
        printEven(arr);
        System.out.println();
        printOdd(arr);
    }


    public static void numArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    // Метод для печати четных чисел
    public static void printEven(int[] arr) {
        for (int each : arr) {
            if (each % 2 == 0) {
                System.out.print(each + " ");
            }
        }
    }

    // Метод для печати нечетных чисел
    public static void printOdd(int[] arr) {
        for (int each : arr) {
            if (each % 2 == 1) {
                System.out.print(each + " ");
            }
        }
    }
}
