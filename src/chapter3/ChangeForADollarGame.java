package chapter3;

/*You're going to make a game — the objective of the game is to enter enough change to equal exactly one dollar.
Get the quantities of the coins.
Count the value of the coins.
Add up all coins.
If exactly $1 - they win.
If more than, tell them how much over.
If less than, tell them how much under.
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        // set things up
        int num5centpieces = 0;
        int num10centpieces = 0;
        int num20centpieces = 0;
        int num50centpieces = 0;
        int numDollars = 0;
        boolean isOneDolla = false;

        // get the change input
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nPlease input your number coins :- ");
        System.out.println("number of 5 cent pieces:");
        num5centpieces = scanner.nextInt();
        System.out.println("number of 10 cent pieces:");
        num10centpieces = scanner.nextInt();
        System.out.println("number of 20 cent pieces:");
        num20centpieces = scanner.nextInt();
        System.out.println("number of 50 cent pieces:");
        num50centpieces = scanner.nextInt();
        System.out.println("number of 1 dollar pieces:");
        numDollars = scanner.nextInt();
        scanner.close();


        // calculate the value
        double totalValue = (num5centpieces * 0.05)
                + (num10centpieces * 0.20)
                + (num20centpieces * 0.20)
                + (num50centpieces * 0.50)
                + (numDollars * 1.00);
        if (totalValue == 1.00) isOneDolla = true;


        // output the result
        if(isOneDolla){
            System.out.println("You win!! You have exactly one dollar!!");
        }
        else{
            System.out.print("Your total is $" + totalValue + " which is $");
        }
        if(totalValue < 1.00){
            String difference = String.format("%.2f", (1.00 - totalValue));
            System.out.println((difference + " under the amount."));
        }
        else if(totalValue > 1.00)
        {
            String difference = String.format("%.2f", (totalValue - 1.00));
            System.out.println(difference + " over the amount.");
        }
        else{
            System.out.println("There is somethin' funky going on here ... investigate!");
        }

    } // end main
} // end class
