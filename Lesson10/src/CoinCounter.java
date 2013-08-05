import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Arrays;

public class CoinCounter {
    public static int CHANGE_NOT_POSSIBLE_FLAG = Integer.MAX_VALUE;
    private int[] denominations;
    private HashMap<Integer, Integer> hashMap = new HashMap();

    private CoinCounter() {
        super();
    }

    /**
     * Creates a new instance with the desired coin denominations. All future calculations will use
     * these coin denominations.
     *
     * @param denominations Integer value coin denominations. They do not have to be sorted, but all must be > 0.
     *                      This is copied and stored locally.
     */
    public CoinCounter(int[] denominations) {
        this.denominations = Arrays.copyOf(denominations, denominations.length);
        Arrays.sort(this.denominations);
    }

    /**
     * Returns the number of coins required to make change for a given value.
     *
     * Greedy algorithm solution.
     *
     * @param totalSum The total value in coins that must be made change for.
     * @return The total number of coins that are needed to make change for totalSum.
     */



        /*
            To calculate the number of coins required to give change in
            most sane coin denominations, a simple 'greedy' algorithm
            is sufficient.

            Imagine you need to give change for 42 cents in America.
            First you would take a quarter; you'll  need 17 more cents for change.
            Second you take a dime; you'll need 7 more cents for change.
            Third you take a nickle; you'll need 2 more cents for change.
            Fourth you take a penny; you'll need 1 more cent for change.
            Fifth you take another penny; you're all done making change, and you needed 5 coins.

            For most currency denominations, we can generalize the rule for giving change:
                * When giving change, always take the largest value coin that's less than the
                change you need to give (e.g. if you need 42, take a quarter. If you have 8, take a nickle).
                * Subtract that amount from the total amount of change you need to give.
                * Repeat.

            Assignment: Implement this algorithm below and make testSimpleNumberOfCoinsRequired pass.
         */

<<<<<<< HEAD
    public int findBiggestCoin(int[] denominations, int value){
        for (int i = denominations.length -1; i>=0; i--){
            if(value>=denominations[i]){
                return denominations[i];
            }

        }
        return 0;
    }

    public int simpleNumberOfCoinsRequired(int totalSum) {
        int numberOfCoins = 0;
        while(totalSum > 0){
            totalSum = totalSum - findBiggestCoin(denominations, totalSum);
            numberOfCoins = numberOfCoins +1;
        }
        return numberOfCoins;
=======
        throw new NotImplementedException();

        int count = 0;
        int denominationIndex = this.denominations.length - 1;
        while (totalSum > 0) {
            if (this.denominations[denominationIndex] <= totalSum) {
                count += Math.floor(totalSum/this.denominations[denominationIndex]);
                totalSum %= this.denominations[denominationIndex];
            } else {
                denominationIndex--;

                if (denominationIndex < 0)
                    break;
            }
        }

        return totalSum == 0 ? count : CHANGE_NOT_POSSIBLE_FLAG;
>>>>>>> 1a063b416922c54ad866294d900b21581b1eca78
    }

    /**
     * Returns the number of coins required to make change for a given value.
     *
     * Memoized algorithm solution.
     *
     * @param totalSum The total value in coins that must be made change for.
     * @return The total number of coins that are needed to make change for totalSum.
     */


   public int numberOfCoinsRequired(int totalSum) {


        /*
            While our simpleNumberOfCoinsRequired works for most
            sane currency denominations, it does not work for all currencies.
            Consider a currency with the denominations 1, 5, 7 and 20.
            Our previous algorithm would say that 3 coins were needed to make
            change for 10, when in fact 2 is the actual solution (2 coins of value 5).

            We must take a different approach to solve for this. Instead of a 'greedy'
            algorithm, we will use memoization.

            Our algorithm must do the following:
                * For each possible value, from 1 to totalSum
                 * If that value is a coin denomination, it's required count is 1
                 * If not, examine that value minus all possible denominations
                    * e.g. If the value was 8, you would look at the number of coins
                      required for 8 - 7, 8 - 5 and 8 - 1.
                 * Take the smallest of those values, plus one
                 * Repeat
                * Return the calculated value for totalSum

            First assignment: Make testNumberOfCoinsRequired pass
            Second assignment: Make testWonderlandDenominations pass
            Third assignment: Make testTerribleDenominations pass
         */

       //Creates hashmap to store denominations for reference
       HashMap<Integer, Integer> denomHash = new HashMap<Integer, Integer>();
        for (int i=0; i<denominations.length; i++){
            denomHash.put(denominations[i], 1);
       }

       for(int i=1; i<=totalSum; i++){
           //if value is a denomination, set to 1
           if(denomHash.get(i) != null){
               hashMap.put(i, 1);
               denomHash.clear();
           }else {
               //inserts potential solutions into denomPotentials[] and sets the value to lowest possible
               int[] denomPotentials = new int[];
               for(int j=0; j<denominations.length; j++){
                    int denomValue = totalSum-denominations[j]+1;
                    denomPotentials[j] = denomValue;
               }
               Arrays.sort(denomPotentials);
               hashMap.put(i,denomPotentials[0]);
           }

           denomHash.clear();
        }




        throw new NotImplementedException();

        // Instructor sample soln: Remove before giving to students:
        // Speed, O(m * n), m = totalSum, n = number of coins
        int[] numberOfCoinsRequiredAtValue = new int[totalSum + 1];

        for (int i = 1; i < numberOfCoinsRequiredAtValue.length; i++) {
            int minimumPreviousValue = CHANGE_NOT_POSSIBLE_FLAG;
            for (int coinValue : this.denominations) {
                if (coinValue == i) {
                    minimumPreviousValue = 1;
                    break;
                } else if (coinValue < totalSum && i - coinValue > 0) {
                    int value = numberOfCoinsRequiredAtValue[i - coinValue];
                    if (value != CHANGE_NOT_POSSIBLE_FLAG)
                        minimumPreviousValue = Math.min(minimumPreviousValue, value + 1);
                } else
                    break;
            }
            numberOfCoinsRequiredAtValue[i] = minimumPreviousValue;
        }

        return numberOfCoinsRequiredAtValue[totalSum];
    }

}
