package day18_loops;
/*
    Remove Duplicates
        Write a program that can remove duplicates from a String / keep one character from each.
         Ex:
                Input: abcabbcd
                Output: abcd
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "sdjkfhdskjhfskdjfh";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            // if unique DOES NOT have eachChar, then add
            if (!unique.contains("" + eachChar)){
                unique += eachChar;
            }

        }

        System.out.println("Original: " + str);
        System.out.println("Uniques: " + unique);


    }


}