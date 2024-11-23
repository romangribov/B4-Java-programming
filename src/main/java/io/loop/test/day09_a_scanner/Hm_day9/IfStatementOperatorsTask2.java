import java.util.Scanner;

public class IfStatementOperatorsTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("What is your salary: ");
        double salary = input.nextDouble();
        System.out.println("You are a full time employee?: ");
        boolean fullTime = input.nextBoolean();

        if (fullTime) {
            salary+=20000;
        }
        if (!fullTime){
            salary-=5000;

        }
        System.out.println("Your final salary is: $"+salary);
    }
}