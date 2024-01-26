import java.util.*;

public class linarSearch {
    public static int search(int numbers[], int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 4, 9, 1, 7, 2, 0, 6, 3 };
        System.out.print("Enter the no you wanna search : ");
        int n = sc.nextInt();
        int index = search(numbers, n);
        System.out.print("index : " + index);
        sc.close();
    }
}