package io.loop.test.day05_variables.Hm_day5;

/*
Task #4 - Computer

    Create a class called Computer in your Practice_Programming project and inside the day04_tasks package

        Task:
            create a main method
                -  Create variables with most appropriate datatypes:
                        brand,
                        processor,
                        ram memory,
                        storage memory,
                        has monitor,
                        has wifi card,
                        description,
                        price,
                        cpu,
                        color,
                        number of monitors,
                        number of usb slots,
                        has usb 3.0
                    -  Print out all the variables and values of the computer

                      Hint: You can use escape sequence to make it look nice.

        Computer Details
            Brand:          Dell
            Processor:      8-core Intel Core i9 processor
            Ram Memory:     16
 */

public class Computer {

    public static void main(String[] args) {

        String pk = "Computer Details";

        String brand = "Dell";
        String processor = "8-core Intel i9 processor";
        int ram_memory = 16;
        int storage_memory = 6;
        boolean has_monitor = true;
        boolean has_wifi_card = true;
        String description = "New pk personal using";
        int price = 3000;
        double cpu = 12.4;
        String color = "red";
        int number_of_monitors = 21;
        int number_of_usb_slots = 1;
        double has_usb = 3.0;

        System.out.println(pk+":" + "\n"+"brand: " + brand + "\n" +"processor: " + processor + "\n"+ "ram memory: " + ram_memory +"\n" + "storage memory: " + storage_memory + "\n" +"has monitor: " + has_monitor + "\n" +"has wifi card: " + has_wifi_card + "\n" +"Description: " +description + "\n" +"price: " + price + "\n" +"cpu: " + cpu + "\n" +"color: " + color + "\n" +"number of monitos: " + number_of_monitors + "\n" +"number of usb slots: " + number_of_usb_slots + "\n" +"has usb: " + has_usb);





    }
}
