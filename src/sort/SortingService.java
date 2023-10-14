package sort;

import sort.bubble.BubbleSort;
import sort.cycle.CycleSort;
import sort.insertion.InsertionSort;
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
        }
    }
}
