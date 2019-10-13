package chapter4;

/*
Do while loop
Let's write a program that allows a user to calculate the sum of two numbers as many times as they like to.
https://testautomationu.applitools.com/java-programming-course/chapter4b.html
 */

import java.io.IOException;
import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean playAgain = false;

        do {

            //get first num
            System.out.println("Please enter your first number:");
            int firstNum = scanner.nextInt();

            //get second num
            System.out.println("Please enter your second number:");
            int secondNum = scanner.nextInt();

            // calculate the sum
            int sum = firstNum + secondNum;
            System.out.println("\033[1;35m" + "The sum of the two numbers is .... " + sum );

            //play again?
            System.out.println("\n\033[0m" + "Play again? Y/N ");
            String answer = scanner.next().toUpperCase();
            if(answer.equalsIgnoreCase("Y"))
            {
                playAgain = true;
                System.out.println("\n\n\n\nWe are playing again!");
            }
            else{
                playAgain = false;
            }

        }
        while (playAgain);

        System.out.println("\nThank you for playing. Goodbye!");
        scanner.close();
    }

}
