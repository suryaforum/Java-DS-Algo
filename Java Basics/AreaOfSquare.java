import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        double area = side * side;
        System.out.printf("The area of the square with side %.2f is %.2f%n", side, area);
        scanner.close();
    }
}
