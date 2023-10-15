package sort.merge;

public class MergeSort {
    public static void sort(int[] arr) {
        System.out.println("Sorting Elements Using Merge Sort");

        int n = arr.length;
        int l = 0;
        int r = n - 1;

        mergeSort(arr, l, r);
    }

    private static void mergeSort(int[] arr, int l, int r) {
        // array should always contain 2 elements
        if (l < r) {
            // find middle index
            int mid = l + ((r - l) / 2);

            // divide array into two half
            mergeSort(arr, l, mid); // first half
            mergeSort(arr, (mid + 1), r); // second half

            // conquer: merger two sorted array
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        // find size of left & right half
        int leftSize = (mid - l) + 1;
        int rightSize = (r - mid) + 1;
        int tempSize = (leftSize + rightSize) - 1;

        // create temp array of total size
        int[] temp = new int[tempSize];

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
        for (int s = 0; s < tempSize; s++) {
            arr[l++] = temp[s];
        }
    }
}
