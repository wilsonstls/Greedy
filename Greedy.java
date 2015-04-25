package greedy;

import java.util.Scanner;
/** 
* Date: 4/15/15 
* this application calculates the fewest number of coins required to represent a given amount.
*/ 
public class Greedy {  
  
     public static void main(String[] varArgs){

        System.out.println("\n  ! The Greedy Program !\n");
        System.out.println("   This application returns the fewest number of coins required to make change.");
        System.out.println("   The user will be prompted to enter the amount of change.\n");
        System.out.println("   The number of coins returned will be based on these coin denominations: ");
        System.out.println("        pennies; nickels; dimes; quarters; half-dollars; one-dollar");

       
        // request user input
        Scanner userInput = new Scanner(System.in);

        System.out.println("\n  Enter a numeric amount greater than 0.00");
        System.out.println("  Note: cents will be rounded to 2 decimal places.");
        String entryAmount = userInput.nextLine();
        System.out.println("\namount entered: " + entryAmount);

        //check for empty input
        int eLength = entryAmount.length();
        if (eLength == 0)
             throw new IllegalArgumentException("No value given");
        else
             {
                 CoinCalculator coinCalculator = new CoinCalculator();
                 coinCalculator.calculateChange(entryAmount);
             }

     }  //closes main
}  //closes Greedy
