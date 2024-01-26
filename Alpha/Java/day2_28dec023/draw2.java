public class draw2 {
    public static final int LINES = 5;

    public static void main(String[] args) {
        for (int i = LINES; i >= 1; i--) {
            for (int j = 1; j <= (i - 1); j++) {
                System.out.print(" ");
            }
            int stars = LINES * 2 + 1 - i * 2;
            for (int k = 1; k <= stars; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
