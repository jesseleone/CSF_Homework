import java.util.Scanner;

public class HelloWorldPrinter {

    public void helloWorld() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your name: ");
        String name = scanner.next();
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        System.out.println("Hello " + name + ", you're " + age + " years old");
    }

    public void helloWorldWithStackedRights() {
        // If your age is above 16, print "You can drive!"
        // If your age is above 18, print "You can vote!"
        // If your age is above 21, print "You can drink!"
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        if (age >= 16) {
            System.out.println("You can drive!");
        }
        if (age >= 18) {
            System.out.println("You can vote!");
        }
        if (age >= 21) {
            System.out.println("You can drink!");
        }
    }

    public void helloWorldWithComboRights() {
        // If your age is above 16 but below 18, print "You can drive!"
        // If your age is above 18 but below 21, print "You can drive and vote!"
        // If your age is above 21, print "You can drive, vote and drink (but not at the same time!)"
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your age?");
        int age = scanner.nextInt();
        if (age >= 21) {
            System.out.println("You can drive, vote and drink (but not at the same time!)");
        }
        else if (age >= 18) {
            System.out.println("You can drive and vote!");
        }
        else if (age >= 16) {
            System.out.println("You can drive!");
        }
    }

    public void helloMultipleTimes() {
        System.out.println("Enter a number of times to say hello! ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Modify this to print "Hello!" exactly n times
        for (int i = 0; i < n; i++) {
            System.out.println("Hello!");
        }
    }

    public void numberAdder() {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        // Change this to stop execution and print "Total sum : " plus the value when the value exceeds 100
        while (sum < 100) {
            System.out.print("Enter a number: ");
            int n = scanner.nextInt();
            sum = sum + n;
            System.out.println("Total sum:" + sum);
        }
        System.out.println("All done! Final sum is " + sum);
    }

    public void oddEven() {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Print if the number is even or not
        System.out.println(isEven(n) ? "It's even!" : "It's odd!");

    }

    public boolean isEven(int n) {
        // Return whether the number is even or odd
        return n % 2 == 0;
    }
}
