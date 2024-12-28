package io.loop.test.day30_b_custom_classes.hm_day30;
/*
Tasks 1 - Rectangle

    Create a class called Rectangle in your Practice_Programming project and inside the da30_tasks package


        Task:
		create instance variables:
    			base, height, perimeter, area

		create instance methods:

    			- toString(): [return String]
        			returns all the information of the Rectangle objects, including the perimeter and area

   			- calculatePerimeter(): [void]
        			calculate the perimeter and store the result into the perimeter instance variable

        			a perimeter of a rectangle is the 4 sides added together

    			- calculateArea(): [void]
       		 		calculate the area and store the result into the area instance variable

        			an area of a rectangle is the height x width





    Create a class called UsingRectangle in your Practice_Programming project and inside the da30_tasks package

	Task:
		create Rectangle objects and test the methods created


юж
------------------------------------------
 */

public class Rectangle {
    double base;
    double height;
    double perimeter;
    double area;

    public void calculatePerimeter(double base, double height)
    {
        perimeter = (base + height) * 2;
    }
    public double getArea(double base, double height)
    {
        area = base * height;
        return area;
    }
    public String toString() {
        String message = "Perimeter: "
                + perimeter + "\nArea: " + area;
        return message;
    }
}