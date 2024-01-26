import java.util.Scanner;

public class jhg {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number from the user
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number from the user
        double num2 = scanner.nextDouble();

        // Close the Scanner to prevent resource leak
        scanner.close();

        // Calculate the sum of the two numbers
        double sum = num1 + num2;

        // Display the result (sum) to the user
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
