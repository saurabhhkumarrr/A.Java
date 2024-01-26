import java.util.*;

public class triangle_01 {
    public static int triangle(int n) {
        for (int lines = 1; lines <= n; lines++) {
            for (int row = 1; row <= lines; row++) {
                if (row % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();

        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lines : ");
        int n = sc.nextInt();
        triangle(n);
        sc.close();
    }
}