package greedy;

import java.math.*;

/**
* Calculates the amount of change to be returned in coins.
* Date: 4/22/2015
*/ 
public class CoinCalculator {


    public String calculateChange(String amountOfChange) {

        //convert input string to BigDecimal type for rounding purposes
        BigDecimal bdChange = new BigDecimal(amountOfChange);

        try {
            if (bdChange.signum() == 0) {
                throw new IllegalArgumentException(" cannot be zero!");
            } else if (bdChange.signum() == -1) {
                throw new IllegalArgumentException(" cannot be a negative amount! ");
            } else {
                bdChange = bdChange.setScale(2, BigDecimal.ROUND_HALF_UP);
                System.out.println("amount rounded: " + bdChange.toString());
            }
        } catch (NumberFormatException amountofChange) {
        }

        //convert BigDecimal into a whole integer
        BigDecimal bdl00 = new BigDecimal("100");
        BigDecimal bdC = bdChange.multiply(bdl00);
        int change;
        change = bdC.intValue();

            int dolCoins = 0, hCoins = 0, qCoins = 0, dimCoins = 0, nCoins = 0, pCoins = 0, totCoins = 0;

            while(change>0)  // greater than
            {
                //qualifies for a dollar coin
                if (change > 99) {
                   dolCoins = (change / 100);
                   change = (change % (dolCoins * 100));  //gives remainder amount
                   totCoins = (totCoins + dolCoins);
                }

                //qualifies for a half-dollar
                if (change < 100 && change > 49) {
                    hCoins = (change / 50);
                    change = (change % (hCoins * 50));  //gives remainder amount
                    totCoins = (totCoins + hCoins);
                }

                //qualifies for a quarter
                if (change < 50 && change > 24) {
                    qCoins = (change / 25);
                    change = (change % (qCoins * 25));  //gives remainder amount
                    totCoins = (totCoins + qCoins);
                }

                //qualifies for a dime
                if (change < 25 && change > 9) {
                    dimCoins = (change / 10);
                    change = (change % (dimCoins * 10));  //gives remainder amount
                    totCoins = (totCoins + dimCoins);
                }

                //qualifies for a nickel
                if (change < 10 && change > 4) {
                    nCoins = (change / 5);
                    change = (change % (nCoins * 5));  //gives remainder amount
                    totCoins = (totCoins + nCoins);
                }

                //qualifies for a penny
                if (change < 5 && change > 0) {
                    pCoins = (change);
                    change = (change % pCoins);  //gives remainder amount
                    totCoins = (totCoins + pCoins);
                }

            }

        System.out.println("\n fewest number of coins to make change is:  "+totCoins);
        System.out.println("\n dollars     :  " +dolCoins);
        System.out.println("\n half-dollars:  " +hCoins);
        System.out.println("\n quarters    :  " +qCoins);
        System.out.println("\n dimes       :  " +dimCoins);
        System.out.println("\n nickels     :  " +nCoins);
        System.out.println("\n penny's     :  " +pCoins);
        return "no coins returned";

    } //closes calculateChange
} //closes class CoinCalculator
