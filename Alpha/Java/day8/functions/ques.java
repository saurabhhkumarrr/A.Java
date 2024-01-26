import java.util.*;

public class ques {
    // Ques---01
    public static void average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        System.out.print("Average of three : " + avg);
    }

    // Ques---02
    public static int isEven(int arg) {
        if (arg % 2 == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    // Ques---03
    public static void pelindrome(int number) {
        int rem = 0, pelin = 0;
        int orgNo = number;
        while (number != 0) {
            rem = number % 10;
            pelin = rem + pelin * 10;
            number /= 10;
        }
        if (orgNo == pelin) {
            System.out.print("its pelindrome ");
        } else {
            System.out.print("Not pelindrome ");
        }
    }

    // Ques---05
    public static void integerSum(int no) {
        int sum = 0;
        while (no != 0) {
            int n = no % 10;
            sum = sum + n;
            no = no / 10;
        }
        System.out.print("digit Sum : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = 52, b = 65, c = 96;
        // average(a, b, c);///////////////--------------calling
        // System.out.print("Enter the no : ");
        // int arg = sc.nextInt();
        // ///////////////////----------calling
        // System.out.println("is even ? 1(true) & 0(false) : " + isEven(arg));
        // // ------------------------------- testing ques--02
        // if (arg % 2 == 0) {
        // System.out.println("even");
        // } else {
        // System.out.println("odd");
        // }
        // System.out.print("Enter the no : ");
        // int number = sc.nextInt();
        // pelindrome(number);
        System.out.print("Enter the no : ");
        int no = sc.nextInt();
        integerSum(no);
    }
}
