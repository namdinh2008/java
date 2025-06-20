public class ArrayError {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3 };
        try {
            System.out.println(numbers[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds!");
        }
    }
}
