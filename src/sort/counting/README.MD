# Counting Sort

*Sort elements based on the frequency of its appearance*

### How It Works: [Link to Video](https://www.youtube.com/watch?v=e644HVGFAJY)

### Time Complexity

---

1. **Worst Case Complexity: O(n+k)**
   If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
2. **Best Case Complexity: O(n+k)**
   It occurs when the array is already sorted
3. **Average Case Complexity: O(n+k)**
   It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

### Space Complexity

---

1. The space complexity of Counting Sort is O(max). Larger the range of elements, larger is the space complexity.

### Properties

1. Frequency Based
2. Stable
3. Not Inplace
4. Consumes more memory

### Cycle Sort Applications

1. There are smaller integers with multiple counts.
2. Linear complexity is the need.

### Advantages

1. Counting sort generally performs faster than all comparison-based sorting algorithms, such as merge sort and
   quicksort, if the range of input is of the order of the number of input.
2. Counting sort is easy to code
3. Counting sort is a stable algorithm.

### Disadvantages

1. Counting sort does’t work on decimal values.
2. Counting sort is inefficient if the range of values to be sorted is very large.
3. Counting sort is not an In-place sorting algorithm, It uses extra space for sorting the array elements.