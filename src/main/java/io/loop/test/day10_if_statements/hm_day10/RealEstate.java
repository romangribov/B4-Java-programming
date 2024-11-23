import java.util.Scanner;

public class RealEstate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your budget:");
        int budget = scanner.nextInt();

        if (budget < 0) {
            System.out.println("That is not a valid budget");
        } else if (budget > 300000) {
            System.out.println("Too much money for this agency");
        } else if (budget >= 80000 && budget <= 100000) {
            System.out.println("Neighborhood: Hills");
            System.out.println("Average Price: 80,000 - 100,000");
            System.out.println("Rating: 4.0");
            System.out.println("Gated: No");
            System.out.println("Allow Pets: Yes");
        } else if (budget >= 55000 && budget <= 75000) {
            System.out.println("Neighborhood: Oaks");
            System.out.println("Average Price: 55,000 - 75,000");
            System.out.println("Rating: 3.5");
            System.out.println("Gated: No");
            System.out.println("Allow Pets: Yes");
        } else if (budget >= 120000 && budget <= 150000) {
            System.out.println("Neighborhood: Highland");
            System.out.println("Average Price: 120,000 - 150,000");
            System.out.println("Rating: 4.5");
            System.out.println("Gated: Yes");
            System.out.println("Allow Pets: No");
        } else if (budget >= 160000 && budget <= 201000) {
            System.out.println("Neighborhood: Canyon");
            System.out.println("Average Price: 160,000 - 201,000");
            System.out.println("Rating: 4.8");
            System.out.println("Gated: Yes");
            System.out.println("Allow Pets: Yes");
        } else {
            System.out.println("No available houses");
        }

    }
}
