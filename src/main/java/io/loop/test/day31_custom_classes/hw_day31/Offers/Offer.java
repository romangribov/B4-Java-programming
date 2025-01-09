package io.loop.test.day31_custom_classes.hw_day31.Offers;
/*
Task 2 - Offer

    Create a class called Offer in your Practice_Programming project and inside the day31_tasks package


        Task:
    	 	- data/create instance variables:
    			location, company, salary, is full time, number of PTO

		- constructor

			- create a constructor that creates an Offer object with the company and location
			- create a constructor that creates an Offer object with the company, location, and salary
			- create a constructor that creates an Offer object with the company, location, salary, isfull time, and number of PTO


		- method/create instance methods:

			toString()
				print all the employees information


Create a separate class to create and test the Offer objects





    Create a class called UsingEmployee in your Practice_Programming project and inside the day31_tasks package

	Task:
		create and test the Offer objects


------------------------------------------


Extra questions to think about:

	O: What does a constructor do?
	Q: When is the constructor called?
	Q: What is the difference of a local variable and instance variable
	Q: What is this keyword used for

 */


    public class Offer {
        private String location;
        private String company;
        private double salary;
        private boolean isFullTime;
        private int numberOfPto;

        @Override
        public String toString() {
            return "Offer{" +
                    "location='" + location + '\'' +
                    ", company='" + company + '\'' +
                    ", salary=" + salary +
                    ", isFullTime=" + isFullTime +
                    ", numberOfPto=" + numberOfPto +
                    '}';
        }

        public Offer(String company, String location) {
            this.company = company;
            this.location = location;
        }

        public Offer(String company, String location, double salary) {
            this.company = company;
            this.location = location;
            this.salary = salary;
        }

        public Offer(String company, String location, double salary, boolean isFullTime, int numberOfPto) {
            this.company = company;
            this.location = location;
            this.salary = salary;
            this.isFullTime = isFullTime;
            this.numberOfPto = numberOfPto;
        }

            public void goToMeeting() {
                System.out.println("Location: " + location);
                System.out.println("Company: " + company);
                System.out.println("Salary: " + salary);
                System.out.println("isFullTime: " + isFullTime);
                System.out.println("numberOfPto = " + numberOfPto);





    }
    }

