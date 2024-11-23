import java.util.Scanner;

public class PrintGreatest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int thirdNumber = scanner.nextInt();

        int greatestNumber;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            greatestNumber = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            greatestNumber = secondNumber;
        } else {
            greatestNumber = thirdNumber;
        }

        System.out.println("The greatest number from " + firstNumber + ", " + secondNumber + ", " + thirdNumber + " is: " + greatestNumber);

        scanner.close();
    }
}
