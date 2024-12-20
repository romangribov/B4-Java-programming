package day17_tasks;

public class CountUpperLowerNumbers {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4s4";


        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int numberCount = 0;


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(ch)) {
                lowerCaseCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }


        System.out.println(upperCaseCount + " uppercase letters");
        System.out.println(lowerCaseCount + " lowercase letters");
        System.out.println(numberCount + " numbers");
    }
}
