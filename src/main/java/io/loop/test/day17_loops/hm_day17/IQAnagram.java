package day17_tasks;

public class IQAnagram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "silent";


        if (str1.length() != str2.length()) {
            System.out.println("Not anagram");
        } else {

            String tempStr2 = str2;
            boolean isAnagram = true;


            for (int i = 0; i < str1.length(); i++) {

                tempStr2 = tempStr2.replaceFirst(Character.toString(str1.charAt(i)), "");


                if (tempStr2.length() == str2.length()) {
                    isAnagram = false;
                    break;
                }
            }


            if (isAnagram) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not anagram");
            }
        }
    }
}
