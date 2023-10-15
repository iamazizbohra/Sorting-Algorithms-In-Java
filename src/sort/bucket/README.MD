# Bucket Sort

*Sort elements using bucket*

### How It Works: [Link to Video](https://www.youtube.com/watch?v=rNdTWHQMvOk)

### Time Complexity

---

1. **Worst Case Complexity: O(n<sup>2</sup>)**
   When there are elements of close range in the array, they are likely to be placed in the same bucket. This may result
   in some buckets having more number of elements than others.
   It makes the complexity depend on the sorting algorithm used to sort the elements of the bucket.
   The complexity becomes even worse when the elements are in reverse order. If insertion sort is used to sort elements
   of the bucket, then the time complexity becomes O(n<sup>2</sup>).
2. **Best Case Complexity: O(n+k)**
   It occurs when the elements are uniformly distributed in the buckets with a nearly equal number of elements in each
   bucket.
   The complexity becomes even better if the elements inside the buckets are already sorted.
   If insertion sort is used to sort elements of a bucket then the overall complexity in the best case will be linear
   ie. O(n+k). O(n) is the complexity for making the buckets and O(k) is the complexity for sorting the elements of the
   bucket using algorithms having linear time complexity at the best case.
3. **Average Case Complexity: O(n)**
   It occurs when the elements are distributed randomly in the array. Even if the elements are not distributed
   uniformly, bucket sort runs in linear time. It holds true until the sum of the squares of the bucket sizes is linear
   in the total number of elements.

### Space Complexity

---

1. The space complexity of Bucket Sort is O(n+k) where k is no of buckets

### Properties

1. May or may not be Stable
2. Not Inplace
3. Buckets are used to sort elements

### Applications

1. Input is uniformly distributed over a range.
2. There are floating point values
