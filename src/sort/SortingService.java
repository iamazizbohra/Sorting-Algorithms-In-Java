package sort;

import sort.bubble.BubbleSort;

public class SortingService {
    public static void sort(int[] arr) {
        BubbleSort.sort(arr);
    }

    public static void sort(int[] arr, SortingAlgorithms sortAlgorithms) {
        switch (sortAlgorithms) {
            case BUBBLE_SORT:
                BubbleSort.sort(arr);
                break;
        }
    }
}
