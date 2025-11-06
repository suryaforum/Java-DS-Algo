public class incrementOp {
    public static void main(String[] args) {
        int num = 10;

        // Using post-increment
        System.out.println("Post-increment:");
        System.out.println("Value before increment: " + num); // 10
        System.out.println("Using num++: " + (num++)); // 10
        System.out.println("Value after increment: " + num); // 11

        // Resetting num for pre-increment demonstration
        num = 10;

        // Using pre-increment
        System.out.println("\nPre-increment:");
        System.out.println("Value before increment: " + num); // 10
        System.out.println("Using ++num: " + (++num)); // 11
        System.out.println("Value after increment: " + num); // 11
    }
}
