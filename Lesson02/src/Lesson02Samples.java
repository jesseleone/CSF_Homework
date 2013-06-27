import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //weirdLoop();
        //sort();
        //allAs();

        // Working on this method
        //reverseNumbers();
        //reverseArray();
        //isGeneticSequence();
        inputAndSearch();
        //calculator();
    }


    public static void sort() {
        int[] unsortedArray = {4,2,9,8,1,3,6,5};
        IntArraySorter sorter = new IntArraySorter();
        System.out.println("Unsorted: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted: " + Arrays.toString(sorter.sortArray(unsortedArray)));
    }

    public static void weirdLoop() {
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
        }
    }

    public static void allAs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String s = scanner.next();
            System.out.println("The string only contains the letter 'a': " + stringIsAllAs(s));
        }
    }

    // There's a bug in this, find it
    public static boolean stringIsAllAs(String s) {
        int i = 0;
        while (i < s.length()) {
            char character = s.charAt(i);
            if (character == 'a' || character == 'A') {
                i++;
            }
            else {
                return false;
            }
        }
        return true;
    }

    // Methods to fill in
    public static void reverseNumbers() {
        // 1) Ask the user for how many numbers they want to enter
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int howManyNumbers = scanner.nextInt();

        // 2) Let them enter that many numbers
        ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();
        for(int i=0;i<howManyNumbers;i++){
            System.out.println("Enter number " + (i+1) );
            int number = scanner.nextInt();
            arrayOfNumbers.add(number);

        }
        // 3) Print them out in reverse
        for(int i=howManyNumbers-1;i>=0;i--){
            System.out.println(arrayOfNumbers.get(i));
        }
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        for (int i=0;i<array.length/2;i++){
            int swapValue1 = array[i];
            int swapValue2 = array[array.length-i-1];
            array[i] = swapValue2;
            array[array.length-i-1] = swapValue1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a string:");
        String userString = scanner.next();

        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        int i = 0;
        while ( i < userString.length()) {
            char character = userString.charAt(i);
            if (character == 'G' || character == 'A' || character == 'T' || character == 'C') {
                i++;
            }
            else {
                System.out.println("false");
                break;
            }
        }
        System.out.println("true");

        // 3) Otherwise, print false
    }

    public static void inputAndSearch() {
        // 1) Ask the user to input 10 words

        // 2) Then ask the user to input a search word
        // 3) If the word exists in the first 10 words, print true, otherwise print false
        // 4) Return to step 2
    }

    public static void calculator() {
        // Below is a very simple calculator
        // 1) Modify it to support both addition, subtraction and multiplication operations
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an addition statement in the format x + y: ");
            Integer leftOperand = scanner.nextInt();
            String plus = scanner.next(); // The "+" sign, just ignore this
            Integer rightOperand = scanner.nextInt();
            System.out.println("Resulting value is: " + (leftOperand.intValue() + rightOperand.intValue()));
        }
    }
}
