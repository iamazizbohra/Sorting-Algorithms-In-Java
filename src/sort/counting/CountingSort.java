package sort.counting;

public class CountingSort {
    public static void sort(int arr[]) {
        System.out.println("Sorting Elements Using Counting Sort");

        int n = arr.length;

        // find max element
        int k = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > k)
                k = arr[i];
        }

        // create new count array of size k
        int[] countArr = new int[k + 1];

        // count frequency of each element
        for (int i = 0; i < n; i++) {
            int e = arr[i];
            countArr[e]++;
        }

        // count prefix sum of frequency array
        for (int i = 1; i <= k; i++) {
            countArr[i] = countArr[i - 1] + countArr[i];
        }

        // put element to its correct place
        int[] output = new int[n];
        for (int i = (n - 1); i >= 0; i--) {
            int e = arr[i];
            int index = --countArr[e];
            output[index] = e;
        }

        // copy output array to original array
        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }
}
