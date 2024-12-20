package io.loop.test.day22_arrays.hm_day22;
/*
Task #2 - AWSZones

    Create a class called AWSZones in your Practice_Programming project and inside the day22_tasks package

        Task:
            Given an app name and a String of zones in the following format

			us-east-1,us-west-1,us-west-2,us-west-3

			print the app deploying to each zone

		Ex:
			app = etsy
    			zones = us-east-1,us-west-2,us-west-1


    			output:
				Deploying etsy to us-east-1...
				Deployment completed for us-east-1

				Deploying etsy to us-west-1...
				Deployment completed for us-west-1

				Deploying etsy to us-west-2...
				Deployment completed for us-west-2


 */

import java.util.Arrays;
import java.util.Scanner;

public class AWSZones {

    public static void main(String[] args) {
//        Scanner key = new Scanner(System.in);
        System.out.println("Make name of the apps");
        String app1 = "Etsy ";

        String zones = "us-east-1,us-west-1,us-west-2,us-west-3";
//        String zones2  = "to us-west-2";
//        String zones3 = "to us-west-1";
//        String zones4 = "to us-east-1";
        String[] apps = zones.split(",");
        System.out.println();

//                {app1, zones};

//        for (String[] row : apps) {
//
//            System.out.println(Arrays.toString(row));

        for (String app : apps) {

            System.out.println("Deploying "+ app1 + "to " + app +"\nDeployment completed for " + app);
//            String zonesEtsy = app[0];
//            String appEtsy = app[1];

//            System.out.println(zonesEtsy + appEtsy);
//            System.out.println(zones2);
//            System.out.println(zones3);
//            System.out.println(zones4);
//            System.out.println(row);

        }
        System.out.println(Arrays.toString(apps));

        for (int i = apps.length-1; i >= 0; i--) {
        System.out.println("Deploying "+ app1 + "to " + apps[i] +"\nDeployment completed for " + apps[i]);

        }
 //       for( String app1 : zones) {
 //           System.out.println(app1);
  //      }

  //      String app2 = "Costco";
  //      String app3 = "Walmart";

    }
}
