import java.util.*;

public class ques3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the cost of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter the cost of eraser : ");
        float eraser = sc.nextFloat();
        float cost = pencil + pen + eraser;
        System.out.println("Total cost = " + cost);
        float gst = cost + (0.18f * cost);
        System.out.println("After taking 18% gst Cost = " + gst);
        sc.close();
    }
}

// Enter cost of 3 items from the user (using float data type) -a pencil,a pen
// and an eraser.You have to output the total cost of the items back to the user
// as their bill.
// (Add on : You can also try adding 18% gst tax to the items in the bill as an
// advanced problem)