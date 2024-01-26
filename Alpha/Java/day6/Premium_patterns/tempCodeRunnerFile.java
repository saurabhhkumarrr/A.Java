import java.util.*;

public class try {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the First Number : ");
        int a = input.nextInt();
        System.out.println("Please Enter the Second Number : ");
        int b = input.nextInt();

        // swap function call
        int swapResult = swapOfTwoNumbers(a, b);
        System.out.println("Swapped Result: " + swapResult);
    }

    public static int swapOfTwoNumbers(int num1, int num2) {
        // Base case to stop recursion
        if (num1 == num2) {
            return num1;
        }

        // Swap values
        int c = num1;
        num1 = num2;
        num2 = c;

        // Recursively call the function
        return swapOfTwoNumbers(num1, num2);
    }
}
