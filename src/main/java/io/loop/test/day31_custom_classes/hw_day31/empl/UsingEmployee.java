package io.loop.test.day31_custom_classes.hw_day31.empl;

// UsingEmployee.java

public class UsingEmployee {
    public static void main(String[] args) {
        // Create Employee objects
        Employee emp1 = new Employee("John Doe", "Software Engineer");
        Employee emp2 = new Employee("Jane Smith", 101, "Project Manager", 85000.50);

        // Test goToMeeting method
        emp1.goToMeeting();
        emp2.goToMeeting();

        // Print employee information using toString
        System.out.println(emp1);
        System.out.println(emp2);
    }
}
