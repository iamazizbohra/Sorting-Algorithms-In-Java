import sort.SortingAlgorithms;
import sort.SortingService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 5, 4, 4, 3, 3, 2, 2, 1, 1};

        SortingService.sort(arr, SortingAlgorithms.QUICK_SORT);

        System.out.println(Arrays.toString(arr));
    }
}