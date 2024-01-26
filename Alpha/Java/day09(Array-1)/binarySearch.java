import java.util.*;

public class binarySearch {
    public static int search(int numbers[], int n) {
        int first = 0, last = numbers.length - 1;
        while (first <= last) {
            int mid = (first + last) / 2;
            if (numbers[mid] == n) {
                return mid + 1;
            }
            if (numbers[mid] > n) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = { 2, 4, 6, 6, 7, 8, 9, 10, 15, 48, 75 };
        System.out.print("Enter the no you wanna search : ");
        int n = sc.nextInt();
        int index = search(numbers, n);
        System.out.print("index : " + index);
        sc.close();
    }
}