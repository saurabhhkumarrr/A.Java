import java.util.*;

public class matrix2323 {
    public static void addition(int size) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int arr1[][] = new int[100][100], arr2[][] = new int[100][100];
        int result[][] = new int[100][100];
        System.out.print("Enter first matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("\t" + arr1[i][j]);
            }
            System.out.println();
        }
        System.out.print("Enter second matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("\t" + arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println("addition of matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }

    }

    public static void multiplication(int size) {
        Scanner sc = new Scanner(System.in);
        int i, j, k;
        int arr1[][] = new int[100][100], arr2[][] = new int[100][100];
        int result[][] = new int[100][100];
        System.out.print("Enter first matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("\t" + arr1[i][j]);
            }
            System.out.println();
        }
        System.out.print("Enter second matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("\t" + arr2[i][j]);
            }
            System.out.println();
        }
        System.out.println("addition of matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                result[i][j] = 0;
                for (k = 0; k < size; k++) {
                    result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print("\t" + result[i][j]);
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of matrix : ");
        int size = sc.nextInt();
        // addition(size);
        multiplication(size);
    }
}