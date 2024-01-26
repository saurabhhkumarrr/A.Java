public class testArrPair {
    public static void pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            // int start = i;
            for (int j = i; j < arr.length; j++) {
                // int end = j; ---------------------------------> i learn this in green
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void subSum01(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                System.out.print(sum + " ");
                if (maxsum < sum) {
                    maxsum = sum;
                }
            }
        }
        System.out.println();
        System.out.print(maxsum + " ");
    }

    public static void subsum02(int arr[]) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int maxsum = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(prefix[i] + " ");
        }
        System.out.println();
        int sum = 0;
        for (int start = 0; start < arr.length; start++) {
            // int start = i;
            for (int end = start; end < arr.length; end++) {
                // int end = j;
                sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; //// -------------> i learn this (easy
                                                                                  //// to understand than before)
                System.out.print(sum + " ");
            }
            if (maxsum < sum) {
                maxsum = sum;
            }
        }
        System.out.println();
        System.out.println(maxsum + " <--maxsum");
    }

    public static void subsumKadans(int arr[]) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum < 0) {
                sum = 0;
            }
            if (maxsum < sum) {
                maxsum = sum;
            }
        }
        System.out.print(sum + " <--sum ");
        System.out.println();
        System.out.print(maxsum + " <--maxsum ");
    }

    public static void main(String args[]) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int arr[] = { -1, -6, -3, -4 };
        // pairs(arr);
        // subarray(arr);
        // subSum01(arr);
        // subsum02(arr);
        subsumKadans(arr);
    }
}