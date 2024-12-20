package io.loop.test.day24_methods.hm_day24;
/*
Task 1 - CurrencyConverter

	Create a class called CurrencyConverter in your Practice_Programming project and inside the day24_tasks package

        Task:

		create a method that will accept a currency type(String) and a currency amount (double)[as dollars]
		and convert the currency from dollars to a different type

		Use the following information to convert from given dollars to the desired currency type

			1 dollar = 0.91 euro
			1 dollar = 121.03 yen
			1 dollar = 14.85 lira
			1 dollar = 1,217.52 won
			1 dollar = 181.45 rupee

			Note: Don't worry about decimal formats, focus on method

			Ex:
				Input:
					euro, 100

				Output:
					91


			Ex:
				Input:
					yen, 50

				Output:
					6051.5
 */

public class CurrencyConverter {

    public static void main(String[] args) {

    }

//    String currencymoney = "dollar";
//        currencymoney = "rupiy";
//        currencymoney = "lira"; // lira
//        currencymoney = "euro";
//
//    double mon = 123;
//    double tue = 181,45;

    public class СurrencyConverter {
        public static void main(String[] args) {



            System.out.println(convertCurrency("euro", 1));
            System.out.println(convertCurrency("yen", 1));
            System.out.println(convertCurrency("lira", 1));
            System.out.println(convertCurrency("won", 1));
            System.out.println(convertCurrency("rupee", 1));
        }

        public static double convertCurrency(String currency, double dollarAmount) {
            double result = 0;


            switch (currency.toLowerCase()) {
                case "euro":
                    result = dollarAmount * 0.91;
                    break;
                case "yen":
                    result = dollarAmount * 121.03;
                    break;
                case "lira":
                    result = dollarAmount * 14.85;
                    break;
                case "won":
                    result = dollarAmount * 1315.80;
                    break;
                case "rupee":
                    result = dollarAmount * 1217.52;
                    break;
                default:
                    System.out.println("Invalid currency!");
                    result = -1;
            }

            return result;
        }
    }
}

