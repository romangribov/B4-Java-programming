import java.util.Scanner;

public class GradeAfterRetake {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.println("What is your score: ");
        int score = input.nextInt();
        System.out.println("Which attempt is this to retake the test?");
        int attempt = input.nextInt();

        if (attempt==1) {
            System.out.println("After the first retake attempt,your score is: "+(score-score*0.10));



        }
        if(attempt==2){
            System.out.println("After the second retake attempt, your score is: "+(score-score*0.20));
        }

        if(attempt==3){
            System.out.println("After the third retake attempt, your score is: "+(score-score*0.35) );
        }

    }
}