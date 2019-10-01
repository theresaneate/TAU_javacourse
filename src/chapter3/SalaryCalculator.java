package chapter3;

/*
IF statement.
All salespeople get a payment of $1000 a week.
Salespeople who exceed 10 sales get an addition bonus of $250
 */

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        //initialise the known values
        int salary = 1000;
        int BONUS = 250;
        int quota = 10;

        //get values for the unknown
        System.out.println("How many sales did the the employee make this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //quick detour for the bonus earners
        if(sales > quota){
            salary = salary + BONUS;
            System.out.println("The employee's salary will include the bonus");
        }


        // output
        System.out.println("The employee's pay is $" + salary);
    }
}
