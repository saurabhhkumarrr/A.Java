import java.util.*;

public class leapyear2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year");
        int year = sc.nextInt();
        // boolean k= (year%4==0 && year%100!=0 || (year%4==0 && year%400==0))?
        // System.out.println(k=true?"Leap"): System.out.println("Not leap");
        System.out.println(
                (year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && year % 400 == 0) ? "Leap" : "Not leap");
        sc.close();

    }
}