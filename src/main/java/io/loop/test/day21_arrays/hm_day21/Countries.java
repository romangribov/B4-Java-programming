import java.util.Scanner;

public class Countries {
    public static void main(String[] args) {

        String[] countries = {
                "Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania",
                "Portugal", "Philippines", "Armenia", "Colombia", "Honduras",
                "Indonesia", "United States"
        };


        System.out.println("First and last characters of each country:");
        for (String country : countries) {
            char firstChar = country.charAt(0);
            char lastChar = country.charAt(country.length() - 1);
            System.out.println(firstChar + " " + lastChar);
        }


        System.out.println("\nCountries that end with 'a':");
        for (String country : countries) {
            if (country.charAt(country.length() - 1) == 'a') {
                System.out.println(country);
            }
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a country to check: ");
        String countryToCheck = scanner.nextLine();

        boolean found = false;
        for (String country : countries) {
            if (country.equalsIgnoreCase(countryToCheck)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(countryToCheck + " is in the list.");
        } else {
            System.out.println(countryToCheck + " is not in the list.");
        }


    }
}
