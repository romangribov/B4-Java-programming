public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "AAABCCDEEF";
        String duplicates = "";


        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);


            if (duplicates.indexOf(currentChar) != -1) {
                continue;
            }


            for (int j = i + 1; j < input.length(); j++) {
                if (currentChar == input.charAt(j)) {
                    duplicates += currentChar;
                    break;
                }
            }
        }

        System.out.println("Duplicate characters: " + duplicates);
    }
}
