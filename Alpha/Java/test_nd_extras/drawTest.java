public class drawTest {
    public static void main(String args[]) {
        System.out.println("printing a pattern ");
        for (int line = 5; line >= 1; line--) {
            for (int i = 1; i <= line - 1; i++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (11 - line * 2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
