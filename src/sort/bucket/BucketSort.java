package sort.bucket;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void sort(int[] arr) {
        System.out.println("Sorting Elements Using Bucket Sort");

        int n = arr.length;

        // find max element
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > maxElement)
                maxElement = arr[i];
        }
        // increment to compute right bucket index
        maxElement++;

        // assume total buckets
        int totalBuckets = 5;

        // create buckets
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
