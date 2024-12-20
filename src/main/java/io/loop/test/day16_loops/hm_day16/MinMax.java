import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int min, max;


        System.out.println("Enter 5 numbers:");
        int num = scanner.nextInt();


        min = num;
        max = num;

        for (int i = 2; i <= 5; i++) {
            System.out.println("Enter number " + i + ":");
            num = scanner.nextInt();


            if (num < min) {
                min = num;
            }


            if (num > max) {
                max = num;
            }
        }


        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
    }
}
