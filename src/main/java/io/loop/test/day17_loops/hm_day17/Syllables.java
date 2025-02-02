package day18_tasks;

public class Syllables {
    public static void main(String[] args) {

        String input = "ja-va";


        String word = "";


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            if (currentChar == '-') {
                int syllableCount = 0;


                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                        syllableCount++;
                    }
                }


                System.out.println("Word: " + word + " - Syllables: " + syllableCount);


                word = "";
            } else {

                word += currentChar;
            }
        }


        if (!word.isEmpty()) {
            int syllableCount = 0;


            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    syllableCount++;
                }
            }


            System.out.println("Word: " + word + " - Syllables: " + syllableCount);
        }
    }
}
