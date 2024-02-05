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
            // elements in the left partition are <= pivot &
            // elements in the right partition are > pivot
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

        // partition around a pivot element
        // accumulate elements <= pivot to left & greater elements to right
        while (i < j) {
            // find 1st greater element than pivot from the beginning
            while (i < h && arr[i] <= pivotElement) i++;

            // find 1st small element than pivot from the end
            while (j > l && arr[j] > pivotElement) j--;

            // if i & j are valid indexes then swap the greater element with a smaller element
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // j is the final index of the pivot so swap it with the pivot
        arr[l] = arr[j];
        arr[j] = pivotElement;

        // return index of pivot
        return j;
    }
}
