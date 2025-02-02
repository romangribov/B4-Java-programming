package day17_tasks;

public class CountUpsLowsNums {
    public static void main(String[] args) {
        String sentence = "This has multiple words";

        int wordCount = 0;
        boolean inWord = false;


        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);


            if (currentChar != ' ') {
                if (!inWord) {

                    wordCount++;
                    inWord = true;
                }
            } else {

                inWord = false;
            }
        }


        System.out.println(wordCount);
    }
}
