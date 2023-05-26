## [944. Delete Columns to Make Sorted](https://leetcode.com/problems/delete-columns-to-make-sorted/)  
My Solution: [solution](./944.java)

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

### Additional Notes:


### Additional problems :   

