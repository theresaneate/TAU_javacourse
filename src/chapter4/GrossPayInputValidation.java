package chapter4;

import java.util.Scanner;

/*
While loop
https://testautomationu.applitools.com/java-programming-course/chapter4a.html
 */

public class GrossPayInputValidation {


    public static void main(String[] args) {


        //setup
        int hoursWorked = 0;
        final int HOURLYRATE = 15;
        int maxHours = 40;

        //get number of hours worked
        System.out.println("\nWhich employee are we capturing for?");
        Scanner scanner = new Scanner(System.in);
        String empName = scanner.next();
        System.out.println("How many hours did " + empName + " work this week?");
        hoursWorked = scanner.nextInt();

        //ensure correct input
        while( hoursWorked > maxHours || hoursWorked < 1)
        {
            System.out.println("Only from 1 to 40 hours permitted, please try again:");
            hoursWorked = scanner.nextInt();
        }

        //calculate pay
        int salary = hoursWorked * HOURLYRATE;

        //output the result
        System.out.println(empName + " worked " + hoursWorked + " hours this week and is earning $" +salary);


    }
}
