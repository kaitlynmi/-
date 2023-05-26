## [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)  
My Solution: [approach 1](./34.java) / [](./)

### Approach 1: Binary Search + Bidirectional scan
After finding an occurance of `target` at index `i`, we do a linear scan forward and backwards to find the first and last position of `target`.   
However, in the worst case when our entire array (or say 90% or more of it) is filled with the `target`, then this is a linear-time algorithm. In that case, the linear scan will end up taking more time than the binary-search itself.


### Approach 2: Two Binary Searches

TBC


### Time and Space Complexity:  

TBC


## [944. Delete Columns to Make Sorted](https://leetcode.com/problems/delete-columns-to-make-sorted/)  
My Solution: [approach 1](./944.java) / [approach 2](./944_2.java)

### Approach 1: Brute force (row -> column)
- Initialize a boolean array columnFlag with a length of nColumns. Each index represents a column, and initially, all columns are considered sorted (marked as false).
- For each column in the current string, check if the corresponding column in the previous string is greater (lexicographically) than the current column.
- if the current column is already flaggef to be unsorted, continue with the loop. This avoids the counter to count towards the same unsorted column multiple times. 

### Approach 2: Brute force (column -> row)
- Iterate over each index (col) in the strings.
- Check if the character at the current index in the current string is less than the character at the same index in the previous string (unsorted).
- If the condition is true, increment counter and break out of the inner loop.

### Time and Space Complexity:  

Both programs have a time complexity of O(N * K), where N is the number of strings and K is the length of each string.  
The space complexity of Approach 1 is O(K) since it uses a boolean array of length nColumns.  
The space complexity of Approach 2 is O(1) as it doesn't use any additional space.

