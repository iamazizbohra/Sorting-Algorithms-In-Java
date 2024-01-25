package sort.counting;

import sort.Sortable;

public class CountingSort implements Sortable {
    private volatile static CountingSort instance;

    private CountingSort() {
    }

    /*
     Singleton Design Pattern
     */
    public static CountingSort getInstance() {
        if (instance == null) {
            synchronized (CountingSort.class) {
                if (instance == null)
                    instance = new CountingSort();
            }
        }

        return instance;
    }

    @Override
    public void sort(int arr[], int... varargs) {
        int n = arr.length;

        // find max element
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k)
                k = arr[i];
        }

        // create new count array of size k
        int[] count = new int[k + 1];

        // count frequency of each element
        for (int i = 0; i < n; i++) {
            int e = arr[i];
            count[e]++;
        }

        // count prefix sum of frequency array to find the positions
        for (int i = 1; i <= k; i++) {
            count[i] = count[i - 1] + count[i];
        }

        // put element to its correct place
        int[] output = new int[n];
        for (int i = (n - 1); i >= 0; i--) {
            int e = arr[i];
            int index = --count[e];
            output[index] = e;
        }

        // copy output array back to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
