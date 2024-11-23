import java.util.Scanner;

public class GiftCard2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 100; //

        System.out.println("Your current balance is: $" + balance);
        System.out.println("Enter the item you wish to buy:");

        String item = scanner.nextLine();
        int price = 0; //


        if (item.equals("Blanket") || item.equals("blanket") || item.equals("BLANKET")) {
            price = 60;
        } else if (item.equals("Charger") || item.equals("charger") || item.equals("CHARGER")) {
            price = 25;
        } else if (item.equals("Hat") || item.equals("hat") || item.equals("HAT")) {
            price = 25;
        } else if (item.equals("Headphones") || item.equals("headphones") || item.equals("HEADPHONES")) {
            price = 30;
        } else if (item.equals("Laptop") || item.equals("laptop") || item.equals("LAPTOP")) {
            price = 200;
        } else if (item.equals("Pants") || item.equals("pants") || item.equals("PANTS")) {
            price = 50;
        } else if (item.equals("Pillow") || item.equals("pillow") || item.equals("PILLOW")) {
            price = 40;
        } else if (item.equals("Smartphone") || item.equals("smartphone") || item.equals("SMARTPHONE")) {
            price = 1000;
        } else if (item.equals("Socks") || item.equals("socks") || item.equals("SOCKS")) {
            price = 5;
        } else if (item.equals("USB cable") || item.equals("usb cable") || item.equals("USB CABLE")) {
            price = 10;
        } else {
            System.out.println("Invalid item!");
        }

        if (price <= balance) {
            balance -= price;
            System.out.println("Thank you for your purchase! Your current balance is: $" + balance);
        } else {
            System.out.println("Sorry, not enough funds on your gift card!");
        }

    }
}
