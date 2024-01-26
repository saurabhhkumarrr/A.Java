import java.util.*;

public class basic {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next(); // this print only before space character
        System.out.print(input);
        String no = sc.nextLine(); // this print with space whole sentence
        System.out.print(no);

        int number = sc.nextInt();
        System.out.print(number);

        float price = sc.nextFloat();
        System.out.print(price);
        sc.close(); /////// sc object class need to be closed at last
    }
}
