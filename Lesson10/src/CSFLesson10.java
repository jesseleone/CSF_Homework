import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CSFLesson10 {

    // Your task is to identify the complexity of this function, and rewrite it to have a better complexity.
    // Was n-squared complexity, now N complexity
    static void firstLab() {
        // Instantiate and populate an array of 10 random floats.
        float[] array = new float[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (float) Math.random();
        }

        System.out.println("Array: " + Arrays.toString(array));

        float total = 0.0f;
        for (int j = 0; j < 10; j++) {
            total += array[j];
        }

        for (int i = 0; i < 10; i++) {
            float thisValue = array[i];
            float average = total / 10.0f;
            System.out.println("Value " + thisValue + " is " + (thisValue / average) * 100.0f + "% of the average.");
        }
    }

    /**
     * Make this code faster.
     */
    static void secondLab() {
        // Instantiate and populate an array of 10 random integers between 0 and 9.
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = (int) (Math.random() * 10.0);
        }

        System.out.println("Array: " + Arrays.toString(array));

        //stores "is duplicate" boolean in hashmap
        HashMap<Integer, Boolean> hashMap = new HashMap();
        for(int i = 0; i < array.length; i++ ){
            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i], false);
            }else{
            hashMap.put(array[i], true);
            }
        }

        //Loops through array once and references hashmap. It's now O(n)
        for (int i = 0; i < array.length; i++) {
            if (hashMap.get(array[i]) == true) {
                System.out.println("Value " + array[i] + " is a duplicate.");
            } else {
                System.out.println("Value " + array[i] + " is not a duplicate.");
            }
        }

    }



    static void thirdLab() {
        int[] denominations = {1, 5, 10, 25};
//        int[] denominations = {1, 5, 7, 20};

        CoinCounter counter = new CoinCounter(denominations);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a value: ");
            int value = scanner.nextInt();
            int numberOfCoins = counter.simpleNumberOfCoinsRequired(value);
            if (numberOfCoins == CoinCounter.CHANGE_NOT_POSSIBLE_FLAG)
                System.out.println("Impossible to make change for " + value);
            else
                System.out.println(numberOfCoins + " coins are required to make change for " + value);
        }
    }

    static void fourthLab() {
        // Bonus Challenge Assignment: Print the first N fibonacci numbers recursively, how fast is this?
        // Note that this requires familiarity with recursion. If you are not familiar with recursion,
        // don't worry, we'll cover it in a coming class.
        int n = 10;
    }

    static void fifthLab() {
        // Bonus Challenge Assignment: Print the first N fibonacci numbers taking advantage of memoization. How fast is this?
        // Note that this does not require recursion.
        int n = 10;
    }

    public static void main(String[] args) {
        //firstLab();
        //secondLab();
        thirdLab();
        //fourthLab();
        //fifthLab();
    }
}
