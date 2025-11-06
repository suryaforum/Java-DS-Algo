public class decrementOp {
    public static void main(String[] args) {
        int num = 10;

        // Using post-decrement
        System.out.println("Post-decrement:");
        System.out.println("Value before decrement: " + num); // 10
        System.out.println("Using num--: " + (num--)); // 10
        System.out.println("Value after decrement: " + num); // 9

        // Resetting num for pre-decrement demonstration
        num = 10;

        // Using pre-decrement
        System.out.println("\nPre-decrement:");
        System.out.println("Value before decrement: " + num); // 10
        System.out.println("Using --num: " + (--num)); // 9
        System.out.println("Value after decrement: " + num); // 9
    }
}
