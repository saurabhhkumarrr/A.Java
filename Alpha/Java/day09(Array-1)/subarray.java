public class subarray {
    public static void subarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 8, 6, 7, 3 };
        subarr(arr);
    }
}

/////////////////// --------Hard problem and logic
//////////// here we are pairing like this ---> [18],[186],[1867],[18673]
/////////////// ------------------------------> [86],[867],[8673]...... so.
/////////////////// on...