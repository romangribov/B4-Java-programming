package io.loop.test.day30_b_custom_classes.hm_day30;

public class UsingRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();

        rectangle1.calculatePerimeter(3.5, 4.7);
        rectangle1.getArea(3.5, 4.7);
        System.out.println(rectangle1.toString());

    }
}