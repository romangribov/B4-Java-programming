package day18_tasks;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String input = "abcabc";


        removeDuplicates(input);
    }


    public static void removeDuplicates(String str) {

        String result = "";


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);


            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result += currentChar;
            }
        }


        System.out.println(result);
    }
}
