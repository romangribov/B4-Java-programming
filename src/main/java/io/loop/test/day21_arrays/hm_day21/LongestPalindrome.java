public class LongestPalindrome {
    public static void main(String[] args) {

        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};

        String longestPalindrome = "";

        for (String word : words) {

            int left = 0;
            int right = word.length() - 1;
            boolean isPalindrome = true;

            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }

            if (isPalindrome && word.length() > longestPalindrome.length()) {
                longestPalindrome = word;
            }
        }

        if (longestPalindrome.equals("")) {
            System.out.println("No palindrome");
        } else {
            System.out.println(longestPalindrome);
        }
    }
}
