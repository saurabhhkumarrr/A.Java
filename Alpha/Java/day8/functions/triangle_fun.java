import java.util.*;

public class triangle_fun {
    public static int triangle(int n) {
        int st = 1;
        int sp = n - 1;
        for (int lines = 1; lines <= n; lines++) {
            for (int space = 0; space < sp; space++) {
                System.out.print("  ");
            }
            for (int star = 0; star < st; star++) {
                System.out.print("* ");
            }
            System.out.println();
            st += 2;
            sp--;
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