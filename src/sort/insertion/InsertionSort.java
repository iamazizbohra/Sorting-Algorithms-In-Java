package sort.insertion;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;

        // loop to select each element
        // first element is already sorted
        for (int i = 1; i < n; i++) {
            // element to be moved to its correct place
            int key = arr[i];
            // comparison starts from the left adjacent element of key till zero
            int j = i - 1;

            // go backward until you find element > key
            // stop as soon as you find element < key
            while (j >= 0 && arr[j] > key) {
                // shift greater elements to the right
                arr[j + 1] = arr[j];
                j--;
            }

            // index of smaller element than key + 1
            // is the correct place for key
            arr[j + 1] = key;
        }
    }
}
