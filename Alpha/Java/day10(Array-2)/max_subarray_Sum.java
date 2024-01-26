public class max_subarray_Sum {

    public static void maxSubarraySum_01(int number[]) {/// --------------> Max Subarray Sum [ Method--01]
        int maxSum = Integer.MIN_VALUE;// ---------------------------> time complexity - very bad i.e // O(n*n*n)
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int current_sum = 0;
                for (int k = start; k <= end; k++) {
                    current_sum += number[k];
                }
                System.out.print(current_sum + " ");
                if (maxSum < current_sum) {
                    maxSum = current_sum;
                }
            }
        }
        System.out.println();
        System.out.print("max sum : " + maxSum);
    }

    public static void maxSubarraySum_02(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        for (int i = 1; i < number.length; i++) {////// prefix sum wala algorithm
            prefix[i] = prefix[i - 1] + number[i];
        }
        int current_sum = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                current_sum = (start == 0) ? prefix[end] : prefix[end] - prefix[start - 1];

                System.out.print(current_sum + " ");
                if (current_sum > maxSum) {
                    maxSum = current_sum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum : " + maxSum);
    }

    public static void subsumKadans(int number[]) {
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {////////////// Kadanas algorithm for (Max Sum Of subarray)
            sum += number[i];
            if (sum < 0) {
                sum = 0;
            }
            if (maxsum < sum) {
                maxsum = sum;
            }
        }
        // System.out.print(sum + " <--sum ");
        System.out.println();
        System.out.println("Kadanas maxsum : " + maxsum);
    }

    public static void subarray(int number[]) { /// -------------->Subarray in traingular pairing
        for (int i = 0; i < number.length; i++) {
            // int start = i;
            for (int j = i; j < number.length; j++) {
                // int end = j;
                // for (int k = start; k <= end; k++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void pairs(int number[]) {//////// ---------------> 2-2 pairing of array
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int number[] = { 1, -2, 6, -3, -1 };
        // subarray(number);
        // pairs(number);
        // maxSubarraySum_01(number);
        maxSubarraySum_02(number);
        subsumKadans(number);
    }
}
