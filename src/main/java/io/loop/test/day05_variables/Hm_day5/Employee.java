package io.loop.test.day05_variables.Hm_day5;

/*
Task #5 - Employee

    Create a class called Computer in your Practice_Programming project and inside the day04_tasks package

        Task:
            create a main method
            Declare and assign these variables according to the most appropriate datatypes: (Use as many datatypes as you can for practice)
                first name,
                last name,
                company name,
                salary,
                start day,
                start month,
                start year,
                are they full time,
                job title,
                office address,

            Declare new variables and use concatenation from previous variables to set their values
                - full name (first and last name)
                - full start date (start month date, year)
                - email (first name + start day @ $company name .com)
                - Salary after 3 years (base salary + 26000 + 26000)
                    Ex: base: 100000
                        start day: 2
                        after 3 year:

            Display the values of the variables following given example

                Ex:
                    Employee Information

                    Full Name:              James Bond
                    Start Date:             2/2/2022
                    E-mail:                 james2@SpaceX.com
                    Salary After 3 years:   $152000.0

 */

public class Employee {

    public static void main(String[] args) {

        String firstName = "Feyruz";
        String lastName = "Feyruzz";
        String companyName = "LoopCamp";
        int salary = 5000;
        int startDay = 05;
        int startMonth = 12;
        int startYear = 2012;
        boolean areTheyFullTime = true;
        String jobTitle = "storeKids";
        String officeAddress = "Maryland Res str. 1488";

        String  fullName = ("FullName: " + firstName + "\t" + "" + lastName);
        System.out.println(fullName);
        String fullStartDate = ("Start Date: " + startMonth + " " + startDay+ " " + startYear + "");
        System.out.println(fullStartDate);
        String email = ("E-mail: " +firstName + startDay+"@"+companyName+".com");
        System.out.println(email);
        int salaryAfter3Years = (salary + 26000 + 26000);
//        System.out.println("Salary After 3 yeras: " + "$"+salaryAfter3Years);
        double ex_base = 100000 + startDay + salaryAfter3Years;
        System.out.println("Salary After 3 yeras: " +"$"+ex_base);




    }
}
