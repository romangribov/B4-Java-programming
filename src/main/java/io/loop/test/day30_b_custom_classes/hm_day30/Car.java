package io.loop.test.day30_b_custom_classes.hm_day30;

public class Car {
    String model;
    int year;
    String color;
    int fuelLevel;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    public void drive() {
        System.out.println("Driving " + model);
        fuelLevel -= 5;
    }

    public void fillTank() {
        if (fuelLevel <= 100) {
            System.out.println(" New fuelLevel = " + fuelLevel);
        }
    }

    public boolean isLow() {
        if (fuelLevel <= 25) {
            System.out.println("Your fuel level is too low");
        }

        return true;
    }
}