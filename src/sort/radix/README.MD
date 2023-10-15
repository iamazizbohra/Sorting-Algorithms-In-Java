# Radix Sort

*Sort elements by counting the frequency of their appearance of last digit*

### How It Works: [Link to Video](https://www.youtube.com/watch?v=HuwgdPVEwCc)

### Time Complexity

---

1. **Worst Case Complexity: O(d*n+b)**
   If we want to sort in ascending order and the array is in descending order then, the worst case occurs.
2. **Best Case Complexity: O(d*n+b)**
   It occurs when the array is already sorted
3. **Average Case Complexity: O(d*n+b)**
   It occurs when the elements of the array are in jumbled order (neither ascending nor descending).

d = no of digits in max element
n = number of elements
b = base of decimal number that is 10

### Space Complexity

---

1. The space complexity of Radix Sort is O(n+b) where b is base that is usually 10

### Properties

1. Frequency Based
2. Radix Based
3. Stable
4. Not Inplace
5. Consumes very less memory than Counting Sort

### Applications

1. DC3 algorithm (Kärkkäinen-Sanders-Burkhardt) while making a suffix array.
2. Places where there are numbers in large ranges.
