import java.util.Scanner;

public class FibPrinter {
    public void askForNumberAtPosition() {
        System.out.println("Enter a fibonacci number: ");
        Scanner scanner = new Scanner(System.in);
        int fibSequence = scanner.nextInt();
        if (fibSequence < 1) {
            System.out.println("Invalid input!");
        }
        else {
            System.out.println("With array: " + this.numberAtPositionWithBigArray(fibSequence));
            System.out.println("Without array: " + this.numberAtPositionWithoutBigArray(fibSequence));
        }
    }

    // Allocates an array that's n long
    public long numberAtPositionWithBigArray(int n) {
        // n is human-readable numbers, starting with 1
        // n = 0 is invalid input
        long[] fibArray = new long[n];

        if (n > 1) {
            fibArray[1] = 1;
            for (int i = 2; i < n; i++) {
                fibArray[i] = fibArray[i-1] + fibArray[i-2];
            }
        }
        return fibArray[n-1];
    }

    // Doesn't allocate an array that's n long
    public long numberAtPositionWithoutBigArray(int n) {
        // As we calculate each number in the sequence, shift the array left
        //  and calculate the new number
        int[] fibNumbers = {0, 1, 1};

        if (n < 2) return fibNumbers[n - 1];
        for (int i = 2; i < n - 1; i++) {
            // Shift left
            fibNumbers[0] = fibNumbers[1];
            fibNumbers[1] = fibNumbers[2];
            // Calculate the new fib number and repeat
            fibNumbers[2] = fibNumbers[1] + fibNumbers[0];
        }

        return fibNumbers[2];
    }
}
