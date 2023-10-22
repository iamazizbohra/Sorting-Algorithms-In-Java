# Quick Sort

*Sort elements using max heap*

### How It Works: [Link to Video](https://www.youtube.com/watch?v=NKJnHewiGdc)

### Time Complexity

---

1. **Worst Case Complexity: O(n logn)**
   If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
2. **Best Case Complexity: O(n logn)**
   It occurs when the array is already sorted
3. **Average Case Complexity: O(n logn)**
   It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

### Space Complexity

---

1. The space complexity of heap sort is O(1)

### Properties

1. Comparison Based
2. Inplace
3. Not Stable

### Applications

Systems concerned with security and embedded systems such as Linux Kernel use Heap Sort because of the O(n log n) upper bound on Heapsort's running time and constant O(1) upper bound on its auxiliary storage.

Although Heap Sort has O(n log n) time complexity even for the worst case, it doesn't have more applications ( compared to other sorting algorithms like Quick Sort, Merge Sort ). However, its underlying data structure, heap, can be efficiently used if we want to extract the smallest (or largest) from the list of items without the overhead of keeping the remaining items in the sorted order. For e.g Priority Queues.

### Advantages

1. **Efficient Time Complexity:** Heap Sort has a time complexity of O(n log n) in all cases. This makes it efficient for sorting large datasets. The log n factor comes from the height of the binary heap, and it ensures that the algorithm maintains good performance even with a large number of elements.
2. **Memory Usage** – Memory usage can be minimal because apart from what is necessary to hold the initial list of items to be sorted, it needs no additional memory space to work
3. **Simplicity** –  It is simpler to understand than other equally efficient sorting algorithms because it does not use advanced computer science concepts such as recursion.

### Disadvantages

1. **Costly:** Heap sort is costly.
2. **Unstable:** Heap sort is unstable. It might rearrange the relative order.
3. **Not Efficient:** Heap Sort is not very efficient when working with highly complex data. 