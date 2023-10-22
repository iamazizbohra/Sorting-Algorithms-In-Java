package sort.heap;

public class HeapSort {
    public static void sort(int[] arr) {
        System.out.println("Sorting Elements Using Heap Sort");

        int n = arr.length;

        // step 1: build heap
        buildHeap(arr, n);

        // step 2: traverse from the last element
        for (int i = (n - 1); i >= 1; i--) {
            // swap 1st element with the ith element
            // because 1st element is always largest in the max heap
            // 1st largest with the last
            // 2nd largest with the second largest, so on
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // root node is disturbed after swapping
            // so call heapify to repair the heap
            heapify(arr, i, 0);
        }
    }

    private static void buildHeap(int[] arr, int n) {
        // call heapify starting from the right most innermost node up until zero
        for (int i = ((n - 2) / 2); i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    private static void heapify(int[] arr, int n, int rootIndex) {
        // assume root as largest element
        int largestElementIndex = rootIndex;
        int leftChildIndex = (2 * rootIndex) + 1;
        int rightChildIndex = (2 * rootIndex) + 2;

        // compare left child with the largest element
        if (leftChildIndex < n && arr[leftChildIndex] > arr[largestElementIndex])
            largestElementIndex = leftChildIndex;

        // compare right child with the largest element
        if (rightChildIndex < n && arr[rightChildIndex] > arr[largestElementIndex])
            largestElementIndex = rightChildIndex;

        // swap if root is not largest
        if (largestElementIndex != rootIndex) {
            int temp = arr[rootIndex];
            arr[rootIndex] = arr[largestElementIndex];
            arr[largestElementIndex] = temp;

            // call heapify recursively for largest
            heapify(arr, n, largestElementIndex);
        }

    }
}
