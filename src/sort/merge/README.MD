# Merge Sort

*Sort elements by dividing and merging them*

### How It Works: [Link to Video](https://www.youtube.com/watch?v=cdHEpbBVjRM)

### Time Complexity

---

1. **Worst Case Complexity: O(n*log n)**
   If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
2. **Best Case Complexity: O(n*log n)**
   It occurs when the array is already sorted
3. **Average Case Complexity: O(n*log n)**
   It occurs when the elements of the array are in jumbled order (neither ascending nor descending).


### Space Complexity

---

1. The space complexity of merge sort is O(n)

### Properties

1. Comparison Based
2. Stable
3. Not Inplace

### Applications

1. **Sorting large datasets:** Merge sort is particularly well-suited for sorting large datasets due to its guaranteed worst-case time complexity of O(n log n).
2. **External sorting:** Merge sort is commonly used in external sorting, where the data to be sorted is too large to fit into memory.
3. **Custom sorting:** Merge sort can be adapted to handle different input distributions, such as partially sorted, nearly sorted, or completely unsorted data.
4. Inversion Count Problem


### Advantages

1. **Stability:** Merge sort is a stable sorting algorithm, which means it maintains the relative order of equal elements in the input array.
2. **Guaranteed worst-case performance:** Merge sort has a worst-case time complexity of O(n log n), which means it performs well even on large datasets.
3. **Parallelizable:** Merge sort is a naturally parallelizable algorithm, which means it can be easily parallelized to take advantage of multiple processors or threads.

### Disadvantages

1. **Space complexity:** Merge sort requires additional memory to store the merged sub-arrays during the sorting process.
2. **Not in-place:** Merge sort is not an in-place sorting algorithm, which means it requires additional memory to store the sorted data. This can be a disadvantage in applications where memory usage is a concern.
3. **Not always optimal for small datasets:** For small datasets, Merge sort has a higher time complexity than some other sorting algorithms, such as insertion sort. This can result in slower performance for very small datasets.