package day17_tasks;

public class CharactersInString {
    public static void main(String[] args) {
        String str = "java";


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = (int) ch;
            System.out.print(asciiValue);
        }
    }
}
