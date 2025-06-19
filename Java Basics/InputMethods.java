import java.util.*;

public class InputMethods {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println("Hello, " + input);

        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Hello, " + name);

        sc.close();
    }
}
