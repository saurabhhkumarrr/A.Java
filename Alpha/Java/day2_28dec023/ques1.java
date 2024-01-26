import java.util.*;

public class ques1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of a,b,c respectively : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("Average of three no. = " + average);
        sc.close();
    }
}

// Question1:In a program input 3 numbers: A,B and C.You have to output the
// average of these 3 numbers.