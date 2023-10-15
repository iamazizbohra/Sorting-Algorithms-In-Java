# Insertion Sort
*Move element to its correct place to the left*

### How It Works
![Insertion Sort](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

The partial sorted list (black) initially contains only the first element in the list. With each iteration one element (red) is removed from the "not yet checked for order" input data and inserted in-place into the sorted list.

### Time Complexity

---
1. **Worst Case Complexity: O(n<sup>2</sup>)**
Suppose, an array is in ascending order, and you want to sort it in descending order. In this case, worst case complexity occurs.
Each element has to be compared with each of the other elements so, for every nth element, (n-1) number of comparisons are made.
Thus, the total number of comparisons = n*(n-1) ~ n2
2. **Best Case Complexity: O(n)**
When the array is already sorted, the outer loop runs for n number of times whereas the inner loop does not run at all. So, there are only n number of comparisons. Thus, complexity is linear.
3. **Average Case Complexity: O(n<sup>2</sup>)**
It occurs when the elements of an array are in jumbled order (neither ascending nor descending).


### Space Complexity

---
1. Space complexity is O(1) because an extra variable key is used.

### Properties
1. Comparison Based
2. Not Stable
3. Inplace
4. Used in practise for small arrays (TimSort & IntroSort)

### Applications
1. The array has a small number of elements
2. There are only a few elements left to be sorted