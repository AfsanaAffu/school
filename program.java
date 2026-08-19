import java.util.Scanner; // Import the Scanner class to read text input

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read data from the standard input stream
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Calculate the sum of the two numbers using the + operator
        double sum = num1 + num2;

        // Display the calculated result to the user
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner object to prevent potential resource leaks
        scanner.close();
    }
}
