import java.util.Scanner;

public class SumOfNUmbersTakingInputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt(); // Taking first number as input
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt(); // Taking second number as input
        int sum = number1 + number2; // Calculating the sum
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + sum); // Printing the result
        scanner.close(); // Closing the scanner to prevent resource leaks
    }
}
