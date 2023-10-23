package sort.bucket;

import sort.Sortable;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort implements Sortable {
    private volatile static BucketSort instance;

    private BucketSort() {
    }

    /*
     Singleton Design Pattern
     */
    public static BucketSort getInstance() {
        if (instance == null) {
            synchronized (BucketSort.class) {
                if (instance == null)
                    instance = new BucketSort();
            }
        }

        return instance;
    }

    @Override
    public void sort(int[] arr, int... varargs) {
        int n = arr.length;

        // find max element
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement)
                maxElement = arr[i];
        }
        // increment to compute right bucket index
        maxElement++;

        // create buckets
        int totalBuckets = varargs[0];
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>(totalBuckets);

        // add ArrayList to each bucket to hold elements
        for (int i = 0; i < totalBuckets; i++) {
            buckets.add(new ArrayList<>());
        }

        // move elements to their appropriate bucket
        for (int i = 0; i < n; i++) {
            int bucketIndex = (totalBuckets * arr[i]) / maxElement;
            ArrayList<Integer> bucket = buckets.get(bucketIndex);
            bucket.add(arr[i]);
        }

        // sort all the buckets individually
        for (int i = 0; i < totalBuckets; i++) {
            ArrayList<Integer> bucket = buckets.get(i);
            Collections.sort(bucket);
        }

        // concatenate elements of all the buckets
        int index = 0;
        for (int i = 0; i < totalBuckets; i++) {
            ArrayList<Integer> bucket = buckets.get(i);

            for (int j = 0; j < bucket.size(); j++) {
                arr[index] = bucket.get(j);
                index++;
            }
        }
    }
}
