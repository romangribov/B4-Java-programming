import java.util.Scanner;

public class TimInDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What time is it now?: ");
        int number = input.nextInt();
        if(number<12){
            System.out.println("Good morning");

        }
        else if (number>=12&& number<15){
            System.out.println("Good afternoon");
        }
        else if (number>=15&&number<24){
            System.out.println("Good evening");
        }
        else
        {
            System.out.println("Invalid input!");
        }
    }
}