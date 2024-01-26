public class draw {
    public static void main(String[] args) {
        for (int line = 1; line <= 5; line++) {
            for (int i = 1; i <= line; i++) { // or for(int line=2; i<line; i++)
                System.out.print(" ");
            }
            for (int i = 1; i <= (11 - 2 * line); i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
