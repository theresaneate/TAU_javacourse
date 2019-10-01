package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {


    public static void main(String[] args) {
//      Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked = scanner.nextInt();

//      Get the hourly pay rate
        System.out.println("enter the employee's pay rate: ");
        double payRate = scanner.nextDouble();
        scanner.close();

//      Multiply hours and pay rate
        double pay = payRate * hoursWorked;

//      Display result
        System.out.println("The employee is receiving $" + pay );

    }
}
