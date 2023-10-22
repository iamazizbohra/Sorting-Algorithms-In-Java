import sort.SortingAlgorithms;
import sort.SortingService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5};

        SortingService.sort(arr, SortingAlgorithms.HEAP_SORT);

        System.out.println(Arrays.toString(arr));
    }
}