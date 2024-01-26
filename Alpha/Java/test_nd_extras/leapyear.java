import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("leap year");
            } else {
                if (year % 400 == 0) {
                    // if (year % 4 == 0) {
                    System.out.println("leap year");
                    // }
                } else {
                    System.out.print("not leap year");
                }
            }
        } else {
            System.out.print("not Leap year ");
        }
        sc.close();
    }
}