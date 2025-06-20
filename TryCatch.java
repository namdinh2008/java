public class TryCatch {
    public static void main(String[] args) {
        try {
            double result = 3 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Finished processing.");
        }

    }
}
