package chapter3;
/*
NESTED IFs
To qualify for a loan, a person must make at least $30,000
and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {
    public static void main(String[] args) {
        //initialise what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;

        //get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        System.out.println("Enter the number of years with your current employer:");
        double years = scanner.nextDouble();

        scanner.close();

        //make decision
        if(salary >= requiredSalary){
            if(years >= requiredYearsEmployed){
                System.out.println("Congrats! You qualify for the  loan.");
            }
            else{
                System.out.println("Sorry you must have worked at your current job for at least 2 years.");
            }
        }
        else{
            System.out.println("Sorry your salary needs to be at or greater than $30,000.");
        }
    }// end main
}// end class
