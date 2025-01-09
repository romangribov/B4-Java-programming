package io.loop.test.day31_custom_classes.hw_day31.empl;

/*
Tasks 1 - Employee

    Create a class called Employee in your Practice_Programming project and inside the da31_tasks package


        Task:

		- data/create instance variables::
			name, id, job title, salary

		- constructor
			- create a constructor that creates an Employee object with the name and job title
			- create a constructor that creates an Employee object with the name, id, job title, and salary

		- method/create instance methods:
			goToMeeting ()
				when this method is called print:
					$name is going to a meeting
			toString ()
				print all the employees information




    Create a class called UsingEmployee in your Practice_Programming project and inside the da31_tasks package

	Task:
		create and test the Employee objects

 */

// Employee.java

public class Employee {
    // Instance variables
    private String name;
    private int id;
    private String jobTitle;
    private double salary;


    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    public Employee(String name, int id, String jobTitle, double salary) {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }


    public void goToMeeting() {
        System.out.println(name + " is going to a meeting");
    }


    @Override
    public String toString() {
        return "Employee [Name=" + name + ", ID=" + id + ", Job Title=" + jobTitle + ", Salary=" + salary + "]";
    }
}

