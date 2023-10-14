package sort.bubble;

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // loop for n-1 passes
        for (int i = 0; i < (n - 1); i++) {

            // optimization for already sorted array
            boolean swapped = false;

            // loop for all the adjacent elements
            for (int j = 0; j < (n - i - 1); j++) {
                // compare adjacent element
                // swap if out of order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // swapped happened means array is not sorted
                    swapped = true;
                }
            }

            if (!swapped)
                return;
        }
    }
}
