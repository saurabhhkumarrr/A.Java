//import java.util.*;

public class passingArguement {
    public static void passingArgs(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 2, 4, 6, 8, 10 };
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "-> ");
        }
        System.out.println();
        passingArgs(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "-> ");
        }
    }
}