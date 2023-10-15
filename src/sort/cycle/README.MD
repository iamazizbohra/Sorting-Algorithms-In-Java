# Cycle Sort
*In each cycle the smallest element will be moved to its correct place to the left*

### How It Works: [Link to Video](https://www.youtube.com/watch?v=vJn71L7CPH4)


### Time Complexity

---
1. **Worst Case Complexity: O(n<sup>2</sup>)**
   If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
2. **Best Case Complexity: O(n<sup>2</sup>)**
   It occurs when the array is already sorted
3. **Average Case Complexity: O(n<sup>2</sup>)**
   It occurs when the elements of the array are in jumbled order (neither ascending nor descending).


### Space Complexity

---
1. The space complexity is constant cause this algorithm is in-place, so it does not use any extra memory to sort.

### Properties
1. Comparison Based
2. Not Stable
3. Inplace
4. Makes min memory writes as compare to all other sorting algorithms

### Applications
1. This sorting algorithm is best suited for situations where memory write or swap operations are costly.
2. Useful for complex problems.


### Advantages
1. No additional storage is required.
2. In-Place sorting algorithm.
3. A minimum number of writes to the memory
4. Cycle sort is useful when the array is stored in EEPROM or FLASH.

### Disadvantages
1. It is not mostly used.
2. It has more time complexity O(n<sup>2</sup>)
3. Unstable sorting algorithm.