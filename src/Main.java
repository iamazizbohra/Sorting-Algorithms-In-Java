import exception.ElementsNotFoundException;
import exception.SortingAlgorithmNotFound;
import sort.selection.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 1, 5};

        System.out.println("Elements before sorting:");
        System.out.println(Arrays.toString(arr));
        System.out.println("");

        try {
            SortingService sortingService = new SortingService();
            sortingService.setElements(arr);
            sortingService.setSortingAlgorithm(SelectionSort.getInstance());
            sortingService.sort();
        } catch (ElementsNotFoundException | SortingAlgorithmNotFound e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Elements after sorting:");
        System.out.println(Arrays.toString(arr));
    }
}