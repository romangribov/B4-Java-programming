package io.loop.test.day30_b_custom_classes.hm_day30;

public class UsingCar {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.model= "Corolla";
        car1.fuelLevel=30;
        car1.color="grey";
        car1.year=2019;
        System.out.println(car1.toString());
        car1.drive();
        car1.fillTank();
        System.out.println(car1.isLow());
    }
}