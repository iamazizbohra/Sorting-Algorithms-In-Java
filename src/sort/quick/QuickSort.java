package sort.quick;

import sort.Sortable;

public class QuickSort implements Sortable {
    private volatile static QuickSort instance;

    private QuickSort() {
    }

    /*
     Singleton Design Pattern
     */
    public static QuickSort getInstance() {
        if (instance == null) {
            synchronized (QuickSort.class) {
                if (instance == null)
                    instance = new QuickSort();
            }
        }

        return instance;
    }

    @Override
    public void sort(int arr[], int... varargs) {
        int n = arr.length;

        int l = 0;
        int h = n - 1;

        quickSort(arr, l, h);
    }

    private void quickSort(int arr[], int l, int h) {
        // there should be always two elements in the array
        if (l < h) {
            // partition array into two & return partition index
            // elements in left partition are <= pivot &
            // elements in right partition are > pivot
            int partitionIndex = partition(arr, l, h);

            // recursively call quickSort for left partition & right partition
            quickSort(arr, l, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, h);
        }
    }

    private int partition(int arr[], int l, int h) {
        // choose 1st element as pivot
        int pivotElement = arr[l];
        int i = l;
        int j = h;

        // partition around pivot element
        // accumulate elements <= pivot to left & greater elements to right
        while (i < j) {
            // find 1st greater element that pivot from beginning
            while (i < h && arr[i] <= pivotElement) i++;

            // find 1st small element that pivot from end
            while (j > l && arr[j] > pivotElement) j--;

            // if i & j are valid index then swap greater element with smaller
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // j is the final index of pivot so swap it with pivot
        int temp = arr[l];
        arr[l] = arr[j];
        arr[j] = temp;

        // return index of pivot
        return j;
    }
}
