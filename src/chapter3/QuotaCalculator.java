package chapter3;

/*
IF ELSE
All salespeople are expected to make at least 10 sales each week.
For those who do, they receive a congratulatory message.
For those who don't, they are informed of how many sales they were short.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        int quota = 10;

        //get unknown values
        System.out.println("Enter the number of sales you made this week:");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        //make a decision
        if(sales >= quota){
            System.out.println("Congrats! You made your quota. Your quota was " + quota + " and you sold " + sales + " units.");
        }
        else{
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota. You were " + salesShort + " short.");
        }

    } // end main
} //end class
