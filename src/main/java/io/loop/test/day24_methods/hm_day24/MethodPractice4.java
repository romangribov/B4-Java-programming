import java.util.Scanner;

public class MethodPractice4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        sumOfNumbers(num1,num2,num3);
    }
    public static void  sumOfNumbers(int num1, int num2, int num3){
        int sum= num1+num2+num3;
        if (sum==180){
            System.out.println("This is a triangle");}
        else if ( sum== 360){
            System.out.println("This is a circle");
        }
        else {System.out.println("This is not angle");}


    }
}