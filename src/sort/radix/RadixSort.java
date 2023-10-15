package sort.radix;

public class RadixSort {
    public static void sort(int[] arr) {
        System.out.println("Sorting Elements Using Radix Sort");

        int n = arr.length;

        // find max element in the array
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement)
                maxElement = arr[i];
        }

        // loop to determine no of digits in maxElement then
        // computing exponent using digits
        // ex: [319/1 > 0], [319/10 > 0], [319/100 > 0] but [319/1000 !> 0]
        for (int exp = 1; maxElement / exp > 0; exp *= 10) {
            countingSortLastDigit(arr, exp);
        }
    }

    public static void countingSortLastDigit(int[] arr, int exp) {
        int n = arr.length;

        // create new count array of size 10,
        // because no of digits in decimal number system is 10
        int[] count = new int[10];

        // count frequency of all the elements
        for (int i = 0; i < n; i++) {
            int element = arr[i];
            int lastDigit = (element / exp) % 10;
            count[lastDigit]++;
        }

        // count prefix sum of frequency array
        for (int i = 1; i < 10; i++) {
            count[i] = count[i - 1] + count[i];
        }

        // put element to its correct place based on the last digit
        int[] output = new int[n];
        for (int i = (n - 1); i >= 0; i--) {
            int element = arr[i];
            int lastDigit = (element / exp) % 10;
            int index = --count[lastDigit];
            output[index] = arr[i];
        }

        // copy output array back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
}
