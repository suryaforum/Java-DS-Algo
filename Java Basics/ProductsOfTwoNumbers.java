import java.util.Scanner;

public class ProductsOfTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1, number2;
        number1 = scanner.nextInt(); // Taking first number as input
        number2 = scanner.nextInt(); // Taking second number as input

        // Calculate the product
        int product = number1 * number2;

        // Print the result
        System.out.println("The product of " + number1 + " and " + number2 + " is: " + product);

        scanner.close(); // Closing the scanner to prevent resource leaks
    }
}
