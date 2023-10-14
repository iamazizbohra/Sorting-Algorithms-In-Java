# Bubble Sort
*Largest element will be bubbled to the last in every pass*

### How It Works:
![Bubble Sort](https://upload.wikimedia.org/wikipedia/commons/c/c8/Bubble-sort-example-300px.gif)

Starting from the beginning of the list, compare the next pair. Swap their positions if they are not in the right order (the second one in the pair is smaller than the first one in the pair). After each iteration, one less element (the last one) is needed to be compared until there are no more elements left to be compared.

### Time Complexity

---
1. **Worst Case: O(n<sup>2</sup>).** The worst case occurs when we want to sort a list in ascending order, but it is arranged in descending order.
2. **Best Case: O(n).** The average case is when the list is arranged in a jumbled order.
3. **Average Case: O(n).** The best case occurs when the list is already arranged in the desired order.

### Space Complexity

---
1. Space complexity is O(1) because an extra variable is used for swapping.
2. In the optimized bubble sort algorithm, two extra variables are used. Hence, the space complexity will be O(2).

### Properties
1. Comparison Based
2. Stable
3. Inplace

### Advantages
1. Bubble sort is easy to understand and implement.
2. It does not require any additional memory space.
3. It is a stable sorting algorithm, meaning that elements with the same key value maintain their relative order in the sorted output.

### Disadvantages
1. Bubble sort has a time complexity of O(n<sup>2</sup>) which makes it very slow for large data sets.
2. Bubble sort is a comparison-based sorting algorithm, which means that it requires a comparison operator to determine the relative order of elements in the input data set. It can limit the efficiency of the algorithm in certain cases.