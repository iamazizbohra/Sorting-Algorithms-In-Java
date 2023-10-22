# Quick Sort

*Sort elements by partitioning them*

### How It Works: [Link to Video](https://www.youtube.com/watch?v=RFbZx9nTB3s)

### Time Complexity

---

1. **Worst Case Complexity: O(n<sup>2</sup>)**
   If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
2. **Best Case Complexity: O(n*log n)**
   It occurs when the array is already sorted
3. **Average Case Complexity: O(n*log n)**
   It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

### Space Complexity

---

1. The space complexity of quick sort is O(log n)

### Properties

1. Comparison Based
2. Divide and Conquer
3. Inplace
4. Not Stable
5. Cache Friendly

### Applications

1. The programming language is good for recursion
2. Time complexity matters
3. Space complexity matters

### Advantages

1. It is a divide-and-conquer algorithm that makes it easier to solve problems.
2. It is efficient on large data sets.
3. It has a low overhead, as it only requires a small amount of memory to function.

### Disadvantages

1. It has a worst-case time complexity of O(n<sup>2</sup>), which occurs when the pivot is chosen poorly.
2. It is not a good choice for small data sets.
3. It is not a stable sort, meaning that if two elements have the same key, their relative order will not be preserved
   in the sorted output in case of quick sort, because here we are swapping elements according to the pivot’s position (
   without considering their original positions).