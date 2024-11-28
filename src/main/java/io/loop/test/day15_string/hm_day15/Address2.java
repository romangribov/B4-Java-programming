import java.util.Scanner;

public class Address2 {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);


        System.out.println("Enter address:");


        String address = key.nextLine();

        if (address.isEmpty()) {
            System.out.println("No address found");
        } else {

            String upperCaseAddress = address.toUpperCase();
            System.out.println(upperCaseAddress);
        }
    }
}
