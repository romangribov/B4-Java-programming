import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter second string: ");
        String secondString = scanner.nextLine();


        if (firstString.length() < 6 || secondString.length() < 6) {
            System.out.println("Invalid data");
        } else {

            String partOne = firstString.substring(0, 4);
            String partTwo = secondString.substring(secondString.length() - 3);


            String email = (partOne + partTwo + "@loopcamp.io").toLowerCase();


            System.out.println(email);
        }
    }
}
