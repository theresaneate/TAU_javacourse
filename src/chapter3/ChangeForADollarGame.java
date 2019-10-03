package chapter3;

/*You're going to make a game — the objective of the game is to enter enough change to equal exactly one dollar.
Get the quantities of the coins.
Count the value of the coins.
Add up all coins.
If exactly $1 - they win.
If more than, tell them how much over.
If less than, tell them how much under.
 */

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        // set things up
        int num5centpieces = 0;
        int num10centpieces = 0;
        int num20centpieces = 0;
        int num50centpieces = 0;
        int numdollars = 0;
        boolean onedolla = false;

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
        numdollars = scanner.nextInt();
        scanner.close();

        // calculate the value
        double totalvalue = (num5centpieces * 0.05)
                + (num10centpieces * 0.20)
                + (num20centpieces * 0.20)
                + (num50centpieces * 0.50)
                + (numdollars * 1.00);
        if (totalvalue == 1.00){
            onedolla = true;
        }

        // output the result

        String totalValue = String.format("%.2f", totalvalue);

        if(onedolla == true){
            System.out.println("You win!! You have exactly one dollar!!");
        }
        else{
            System.out.print("Your total is $" + totalvalue + " which is $");
        }

        if(totalvalue < 1.00){
            String difference = String.format(1.00 - totalvalue, 2)
            System.out.println(() + " under the amount.");
        }
        else if(totalvalue > 1.00)
        {
            System.out.println((totalvalue - 1.00) + " over the amount.");
        }

    } // end main
} // end class
