public class largest_smallest_no {
    public static int getlargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest : " + smallest);

        return largest; ///////////////////////////////// function can return only one value
    }

    public static void main(String args[]) {
        int numbers[] = { 4, 9, 2, 32, 7, 3, 98, 42, 38, 5 };
        int lar = getlargest(numbers);
        System.out.print("largest : " + lar);
    }
}