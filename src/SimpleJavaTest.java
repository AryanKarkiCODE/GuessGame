import java.util.Scanner;

public class SimpleJavaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Question
        System.out.println("What is the capital of France?");
        System.out.println("A) Berlin");
        System.out.println("B) Madrid");
        System.out.println("C) Paris");
        System.out.println("D) Rome");

        // User input
        System.out.print("Enter your choice (A, B, C, or D): ");
        String answer = scanner.next().toUpperCase(); // Convert to uppercase for case-insensitivity

        // Check answer
        if (answer.equals("C")) {
            System.out.println("Correct! Paris is the capital of France.");
        } else {
            System.out.println("Wrong answer! The correct answer is C) Paris.");
        }

        scanner.close();
    }
}
