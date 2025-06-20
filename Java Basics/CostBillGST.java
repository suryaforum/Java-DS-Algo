import java.util.Scanner;

public class CostBillGST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("GST Calculator");

        System.out.print("Enter the cost of pencil: ");
        float pencilCost = scanner.nextFloat();

        System.out.print("Enter the cost of pen: ");
        float penCost = scanner.nextFloat();

        System.out.print("Enter the cost of eraser: ");
        float eraserCost = scanner.nextFloat();

        float itemsCost = pencilCost + penCost + eraserCost;

        float gstPercentage = 18.0f; // Assuming GST is 18%

        float gstAmount = (itemsCost * gstPercentage) / 100;
        float totalCost = itemsCost + gstAmount;

        System.out.printf("The total amount on the items are: %.2f%n", itemsCost);
        System.out.printf("The GST amount on the item is: %.2f%n", gstAmount);
        System.out.printf("The total cost of the item including GST is: %.2f%n", totalCost);

        scanner.close();
    }
}
