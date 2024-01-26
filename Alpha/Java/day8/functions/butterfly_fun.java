import java.util.*;

public class butterfly_fun {
    public static int butterfly(int n) {
        int sp = 2 * n - 2;
        int st = 1;
        for (int lines = 1; lines <= 2 * n; lines++) {
            for (int star = 0; star < st; star++) {
                System.out.print("* ");
            }
            for (int space = 0; space < sp; space++) {
                System.out.print("  ");
            }
            for (int star = 0; star < st; star++) {
                System.out.print("* ");
            }
            System.out.println();
            if (lines < n) {
                st++;
                sp -= 2;
            } else if (lines > n) {
                st--;
                sp += 2;
            }
        }
        return 0;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lines : ");
        int n = sc.nextInt();
        butterfly(n);
        sc.close();
    }
}