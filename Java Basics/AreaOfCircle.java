import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble(); // Taking radius as input
        double area = 3.14f * radius * radius; // Calculating area using the formula πr²

        System.out.println("The area of the circle with radius " + radius + " is: " + area); // Printing the result

        scanner.close(); // Closing the scanner to prevent resource leaks
    }
}
