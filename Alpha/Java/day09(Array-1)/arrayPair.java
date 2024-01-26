public class arrayPair {
    public static void pair(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 9, 6, 2, 3, 7, 8 };
        pair(arr);
    }
}