package sort.cycle;

import sort.Sortable;

public class CycleSort implements Sortable {
    private volatile static CycleSort instance;

    private CycleSort() {
    }

    /*
     Singleton Design Pattern
     */
    public static CycleSort getInstance() {
        if (instance == null) {
            synchronized (CycleSort.class) {
                if (instance == null)
                    instance = new CycleSort();
            }
        }

        return instance;
    }

    @Override
    public void sort(int[] arr, int... varargs) {
        int n = arr.length;

        // loop to start a cycle from each element
        for (int cs = 0; cs < n; cs++) {
            int item = arr[cs];
            int pos = cs;

            // count no of the smallest element from this position
            for (int j = cs + 1; j < n; j++) {
                if (arr[j] < item)
                    pos++;
            }

            // if pos == cs means element is already at correct place
            if (pos == cs)
                continue;

            // ignore duplicates to avoid infinite cycles
            while (item == arr[pos])
                pos++;

            // swap if smaller elements are found
            if (pos != cs) {
                int temp = arr[pos];
                arr[pos] = item;
                item = temp;
            }

            while (pos != cs) {
                pos = cs;

                // count no of the smallest element from this position
                for (int j = cs + 1; j < n; j++) {
                    if (arr[j] < item)
                        pos++;
                }

                // ignore duplicates to avoid infinite cycles
                while (item == arr[pos])
                    pos++;

                // swap if smaller elements are found
                if (item != arr[pos]) {
                    int temp = arr[pos];
                    arr[pos] = item;
                    item = temp;
                }
            }
        }
    }
}

