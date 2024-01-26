
public class invertedStarPattern {
    public static void main(String[] args) {
        for (int line = 1; line <= 4; line++) {
            for (int star = 1; star <= 4 + 1 - line; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/* 




 ****
 ***
 **
 *
 


 */