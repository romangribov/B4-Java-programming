import java.util.Scanner;

public class GradebookOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();


        String[] studentNames = new String[numStudents];
        int[] studentScores = new int[numStudents];
        char[] studentGrades = new char[numStudents];


        scanner.nextLine();

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter score for " + studentNames[i] + ": ");
            studentScores[i] = scanner.nextInt();
            scanner.nextLine();


            if (studentScores[i] > 85) {
                studentGrades[i] = 'A';
            } else if (studentScores[i] > 75) {
                studentGrades[i] = 'B';
            } else if (studentScores[i] > 65) {
                studentGrades[i] = 'C';
            } else {
                studentGrades[i] = 'D';
            }
        }


        System.out.println("\nGradebook:");
        System.out.println("Name\t\tScore\tGrade");
        System.out.println("------------------------------");

        for (int i = 0; i < numStudents; i++) {
            System.out.println(studentNames[i] + "\t\t" + studentScores[i] + "\t" + studentGrades[i]);
        }


    }
}
