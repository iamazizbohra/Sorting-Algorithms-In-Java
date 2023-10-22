package sort.selection;

import sort.Sortable;

public class SelectionSort implements Sortable {
    private volatile static SelectionSort instance;

    private SelectionSort() {
    }

    /*
     Singleton Design Pattern
     */
    public static SelectionSort getInstance() {
        if (instance == null) {
            synchronized (SelectionSort.class) {
                if (instance == null)
                    instance = new SelectionSort();
            }
        }

        return instance;
    }

    @Override
    public void sort(int[] arr, int... varargs) {
        int n = arr.length;

        // loop for (n-1) passes
        for (int i = 0; i < n; i++) {
            // assume this is the index of min element
            int min_index = i;

            // loop to find min element in remaining elements
            for (int j = i + 1; j < n; j++) {
                // compare and find index of min element < assumed arr[min_index]
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // swap elements to put min element to its correct position
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
