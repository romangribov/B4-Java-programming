public class LongestAndShortestStrings {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "banana", "kiwi", "strawberry"};

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {

            if (word.length() < shortest.length()) {
                shortest = word;
            }

            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
