package sort.insertion;

import sort.Sortable;

public class InsertionSort implements Sortable {
    private volatile static InsertionSort instance;

    private InsertionSort() {
    }

    /*
     Singleton Design Pattern
     */
    public static InsertionSort getInstance() {
        if (instance == null) {
            synchronized (InsertionSort.class) {
                if (instance == null)
                    instance = new InsertionSort();
            }
        }

        return instance;
    }

    @Override
    public void sort(int[] arr, int... varargs) {
        int n = arr.length;

        // loop to select each element
        // first element is already sorted
        for (int i = 1; i < n; i++) {
            // element to be moved to its correct place
            int key = arr[i];
            // comparison starts from the left adjacent element of key till zero
            int j = i - 1;

            // go backward while you find element > key
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
