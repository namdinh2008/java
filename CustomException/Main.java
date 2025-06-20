package CustomException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        try {
            if (age < 18) {
                throw new InvalidAgeException("You must be 18 or older.");
            } else {
                System.out.println("You are eligible.");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
