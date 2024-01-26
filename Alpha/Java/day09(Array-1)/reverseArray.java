public class reverseArray {
    public static void reverse(int array[]) {
        int start = 0, end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int array[] = { 2, 5, 8, 6, 3, 7, 2, 10 };
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print("-> " + array[i]);
        }
    }
}