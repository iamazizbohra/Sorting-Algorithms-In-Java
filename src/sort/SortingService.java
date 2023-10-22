package sort;

import sort.bubble.BubbleSort;
import sort.bucket.BucketSort;
import sort.counting.CountingSort;
import sort.cycle.CycleSort;
import sort.heap.HeapSort;
import sort.insertion.InsertionSort;
import sort.merge.MergeSort;
import sort.quick.QuickSort;
import sort.radix.RadixSort;
import sort.selection.SelectionSort;

public class SortingService {
    public static void sort(int[] arr) {
        BubbleSort.sort(arr);
    }

    public static void sort(int[] arr, SortingAlgorithms sortAlgorithms) {
        switch (sortAlgorithms) {
            case BUBBLE_SORT:
                BubbleSort.sort(arr);
                break;
            case SELECTION_SORT:
                SelectionSort.sort(arr);
                break;
            case INSERTION_SORT:
                InsertionSort.sort(arr);
                break;
            case CYCLE_SORT:
                CycleSort.sort(arr);
                break;
            case COUNTING_SORT:
                CountingSort.sort(arr);
                break;
            case RADIX_SORT:
                RadixSort.sort(arr);
                break;
            case BUCKET_SORT:
                BucketSort.sort(arr);
                break;
            case MERGE_SORT:
                MergeSort.sort(arr);
                break;
            case QUICK_SORT:
                QuickSort.sort(arr);
                break;
            case HEAP_SORT:
                HeapSort.sort(arr);
                break;
        }
    }
}
