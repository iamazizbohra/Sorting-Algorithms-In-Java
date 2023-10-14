import sort.SortingAlgorithms;
import sort.SortingService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 2, 1};

        SortingService.sort(arr, SortingAlgorithms.SELECTION_SORT);

        System.out.println(Arrays.toString(arr));
    }
}