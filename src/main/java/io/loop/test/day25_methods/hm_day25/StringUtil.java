//package io.loop.test.day25_methods.hm_day25;
///*
//create a method fixFormat that will accept a String and return a String in proper format.
//
//		Proper format is:
//			First character starting as uppercase and the rest as lowercase
//
//
//		Ex:
//			Input:
//				jamES
//			Output:
//				James
// */
//
//import java.util.Scanner;
//
//public class StringUtil {
//    public static void main(String[] args) {
//
////        Scanner key = new Scanner(System.in);
////        System.out.println("First Character");
////        String name =  key.nextLine();
////        String name2 = str.indexOf('1');
////        char character = str.charAt('1');
////        System.out.println(name2);
//
//        public class StringUtil {
//
//            public static void main(String[] args) {
//                // Пример использования метода fixFormat
//                String name = "jamES";
//                fixFormat(name); // Вызываем метод, который выводит результат
//            }
//
//            // Метод для форматирования строки
//            public static void fixFormat(String input) {
//                if (input == null || input.isEmpty()) {
//                    System.out.println(input); // Если строка пуста или null, выводим её как есть
//                    return;
//                }
//
//                // Преобразуем первую букву в верхний регистр, а остальные в нижний
//                String result = input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
//                System.out.println(result); // Выводим резул