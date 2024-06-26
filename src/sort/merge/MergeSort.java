package sort.merge;

import sort.Sortable;

public class MergeSort implements Sortable {
    private volatile static MergeSort instance;

    private MergeSort() {
    }

    /*
     Singleton Design Pattern
     */
    public static MergeSort getInstance() {
        if (instance == null) {
            synchronized (MergeSort.class) {
                if (instance == null)
                    instance = new MergeSort();
            }
        }

        return instance;
    }

    @Override
    public void sort(int[] arr, int... varargs) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        mergeSort(arr, l, r);
    }

    private void mergeSort(int[] arr, int l, int r) {
        // array should always contain 2 elements
        if (l < r) {
            // find middle index
            int mid = l + ((r - l) / 2);

            // divide array into two half
            mergeSort(arr, l, mid); // first half
            mergeSort(arr, (mid + 1), r); // second half

            // conquer: merge two sorted array
            merge(arr, l, mid, r);
        }
    }

    private void merge(int[] arr, int l, int mid, int r) {
        // find size of left & right half
        int leftSize = (mid - l) + 1;
        int rightSize = (r - mid) + 1;
        int totalElements = (leftSize + rightSize) - 1;

        // create temp array of total elements
        int[] temp = new int[totalElements];

        // two pointers to keep track of elements of left & right array
        int i = l;
        int j = mid + 1;
        // start index of temp array
        int k = 0;
        while (i <= mid && j <= r) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // if any elements are remaining in left half put them in temp array
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // if any elements are remaining in right half put them in temp array
        while (j <= r) {
            temp[k++] = arr[j++];
        }

        // copy elements from temp array back to original array
        for (int s = 0; s < totalElements; s++) {
            arr[l++] = temp[s];
        }
    }
}
