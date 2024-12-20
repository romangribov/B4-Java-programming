package day17_tasks;

public class BiggestSubstring {
    public static void main(String[] args) {
        String str = "aaabbbcccccddddee";


        findBiggestSubstring(str);
    }

    public static void findBiggestSubstring(String str) {

        String maxSubstring = "";
        String currentSubstring = "";
        char previousChar = str.charAt(0);
        currentSubstring += previousChar;


        for (int i = 1; i < str.length(); i++) {
            char currentChar = str.charAt(i);


            if (currentChar == previousChar) {
                currentSubstring += currentChar;
            } else {

                if (currentSubstring.length() > maxSubstring.length()) {
                    maxSubstring = currentSubstring;
                }


                currentSubstring = "" + currentChar;
            }


            previousChar = currentChar;
        }


        if (currentSubstring.length() > maxSubstring.length()) {
            maxSubstring = currentSubstring;
        }


        System.out.println(maxSubstring);
    }
}
